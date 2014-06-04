import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;

public class Test1 implements ActionListener, ItemListener {

    ExecutorService executor = Executors.newCachedThreadPool();
    private final BlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>(10);
    private final List<Integer> holder = new LinkedList<Integer>();
    private volatile ApplicationState appState = ApplicationState.CLEAN;
    private FakeProducer fakeProducer = new FakeProducer("FakeProducer");
    private FakeConsumer fakeConsumer = new FakeConsumer();

    //GUI stuff
    static JToggleButton startBtn;
    //static JToggleButton pauseBtn;
    static JButton stopBtn;
    static JButton showBtn;

    private enum ApplicationState {
        CLEAN, RUN, PAUSE
    }

    private enum ThreadState {
        RUNNING, WAITING
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        Test1 guiController = new Test1();
        JFrame frame = new JFrame("GUI Concurrency");
        frame.setPreferredSize( new Dimension(400, 200));
        frame.setLayout( new FlowLayout() );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        startBtn = new JToggleButton("Start");
        startBtn.addItemListener(guiController);

        stopBtn = new JButton("Cancel");
        stopBtn.setEnabled(false);
        stopBtn.setActionCommand("Cancel");
        stopBtn.addActionListener(guiController);

        showBtn = new JButton("Show");
        showBtn.setActionCommand("Show");
        showBtn.addActionListener(guiController);

        frame.getContentPane().add(startBtn);
        frame.getContentPane().add(stopBtn);
        frame.getContentPane().add(showBtn);

        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        System.out.println(command + " is clicked");

        if ( command.equals("Cancel") ) {
            startBtn.setText("Start");
            appState = ApplicationState.CLEAN;

            synchronized (fakeProducer) {
                fakeProducer.notify();
            }

            synchronized (fakeConsumer) {
                fakeConsumer.notify();
            }

            holder.clear();
            executor.shutdown();
        }
        else if ( command.equals("Show") ) {
            for ( int i : holder ) {
                System.out.println("[" + i + "]");
            }
            System.out.println();
        }

    }

    class FakeProducer implements Runnable {

        private String name;
        public ThreadState state;

        public FakeProducer(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            state = ThreadState.RUNNING;
            List<Integer> list = new LinkedList<Integer>();
            for ( int i = 0; i <= 10000; i++ ) {
                list.add(i);
            }

            /**
             * While the application state is run, then keep running.
             * But if the state is put to be paused, then the thread waits.
             * I want to start running again after putting the application to pause.
             * When I click Cancel, then the application stop the thread. Then I start as clean.
             */

            for ( int i : list ) {
                if ( appState == ApplicationState.RUN ) {
                    try {
                        //This line blocks the app if there is no
                        //space in the queue, so it 
                        //will never reach appState=Pause
                        queue.put(i);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if (appState == ApplicationState.PAUSE) {
                    try {
                        synchronized (this) {
                            state = ThreadState.WAITING;
                            wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        //This condition is to not to miss the i_th item when the state
                        //was PAUSE
                        if ( appState == ApplicationState.RUN ) {
                            try {
                                queue.put(i);
                            } catch (InterruptedException e1) {
                                e1.printStackTrace();
                            }
                        }
                    }
                }
                else if ( appState == ApplicationState.CLEAN ) {
                    break;
                }
            }
            //This is to let the rest of the app know that the list is finished
            //appState = ApplicationState.CLEAN;    
        }

    }

    class FakeConsumer implements Runnable {
        public ThreadState state;
        @Override
        public void run() {
            state = ThreadState.RUNNING;
            while( (appState == ApplicationState.RUN) || (appState == ApplicationState.PAUSE) ) {
                if ( appState == ApplicationState.RUN ) {
                    try {
                        //If this thing is blocking then it won't see anything i.e
                        //it won't check appState if Pause
                        //holder.add( queue.take() );
                        int value = queue.remove();
                        holder.add(value);

                    } catch (NoSuchElementException e) {
                        //e.printStackTrace();
                    }
                }
                else if (appState == ApplicationState.PAUSE) {
                    try {
                        synchronized (this) {
                            state = ThreadState.WAITING;
                            wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if ( e.getStateChange() == ItemEvent.SELECTED ) {

            if ( appState == ApplicationState.CLEAN ) {
                System.out.println("Start");
                startBtn.setText("Pause");
                appState = ApplicationState.RUN;
                executor = Executors.newCachedThreadPool();
                fakeProducer = new FakeProducer("FakeProducer");
                fakeConsumer = new FakeConsumer();
                executor.execute( fakeProducer );
                executor.execute( fakeConsumer );
                executor.shutdown();
                stopBtn.setEnabled(false);
            }
            //Now continue execution
            else if ( appState == ApplicationState.PAUSE ) {
                startBtn.setEnabled(false);

                System.out.println( fakeProducer.state  );
                System.out.println( fakeConsumer.state  );

                //Block the app until all threads are waiting
                while( fakeProducer.state == ThreadState.RUNNING | 
                        fakeConsumer.state == ThreadState.RUNNING ) {
                }

                /*
                 *Once they are really both are waiting, then push them to work again
                 */

                appState = ApplicationState.RUN;

                synchronized (fakeProducer) {
                    fakeProducer.state = ThreadState.RUNNING;
                    fakeProducer.notify();
                }

                synchronized (fakeConsumer) {
                    fakeConsumer.state = ThreadState.RUNNING;
                    fakeConsumer.notify();
                }

                startBtn.setText("Pause");
                stopBtn.setEnabled(false);
                startBtn.setEnabled(true);
            }
        }
        else {
            System.out.println("Pause");
            startBtn.setText("Continue");
            appState = ApplicationState.PAUSE;
            stopBtn.setEnabled(true);
        }
    }

}