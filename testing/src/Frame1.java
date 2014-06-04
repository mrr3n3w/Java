import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.*;  //notice javax

public class Frame1 implements  ActionListener{


	int diceAmount = 0;
	int dice = 0;
	int counter = 0;
	
	Thread t;

	public void Test(){
	t=new Thread();
	t.start();
	}

	
	JPanel titlePanel , buttonPanel, printPanel;
	JLabel dicePrint, diceLabel;
	JButton rollDice, reset;
	
	
	public JPanel panel1()//content pane
	{
		JPanel totalGUI = new JPanel();
		totalGUI.setLayout(null);
		
		//Print Dice reading
        titlePanel = new JPanel();
        titlePanel.setLayout(null);
        titlePanel.setLocation(10, 0);
        titlePanel.setSize(250, 30);
        totalGUI.add(titlePanel);

        diceLabel = new JLabel("Dice Says");
        diceLabel.setLocation(65, 5);
        diceLabel.setSize(100, 30);
        diceLabel.setHorizontalAlignment(0);
        diceLabel.setForeground(Color.black);
        titlePanel.add(diceLabel);


        //Buttons
        buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        buttonPanel.setLocation(0, 100);
        buttonPanel.setSize(250, 70);
        totalGUI.add(buttonPanel);
        
        rollDice = new JButton("Roll Dice!");
        rollDice.setLocation( 0 , 0 );
        rollDice.setSize( 120 , 40 );
        rollDice.addActionListener(this);
        buttonPanel.add(rollDice);
        
        reset = new JButton("Reset");
        reset.setLocation(130 , 0);
        reset.setSize(120, 40);
        reset.addActionListener(this);
        buttonPanel.add(reset);
        
        //Printer
        printPanel = new JPanel();
        printPanel.setLayout(null);
        printPanel.setLocation(75, 45);
        printPanel.setSize(250, 30);
        totalGUI.add(printPanel);

        dicePrint = new JLabel(""+diceAmount);
        dicePrint.setLocation( 0, 0 );
        dicePrint.setSize(100, 30);
        dicePrint.setHorizontalAlignment(0);
        printPanel.add(dicePrint);

        //return the file
        totalGUI.setOpaque(true);
        return totalGUI;
	}
	
	public void Sleep()
	{
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		{

			
			if (e.getSource() == rollDice)
			{
				Random number = new Random();

					dice = 1 + number.nextInt(6);
					diceAmount = diceAmount + dice;
					dicePrint.setText(""+diceAmount);
					Sleep();
					diceAmount = 0;
					dicePrint.setText(""+diceAmount);
			}
			if (e.getSource() == reset)
			{
					diceAmount = 0;
					dicePrint.setText(""+diceAmount);
				
			}
			
	}
}
	

	private static void createAndShowGUI()
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Dice Roller");
		
		Frame1 demo = new Frame1();
	    frame.setContentPane(demo.panel1());
	
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(250, 190);
	    frame.setVisible(true);
		
	}
  public static void main(String args[])
  {
	  SwingUtilities.invokeLater(new Runnable() 
	  { 
		  public void run() 
	  {
		  createAndShowGUI();
	  }
	  });
  }
}

