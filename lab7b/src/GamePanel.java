import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * @author Jordan 300219995
 */
public class GamePanel extends JPanel implements ActionListener
{
	GameCanvas canvas = new GameCanvas(201, 201, 4);
	JPanel canvasPanel = new JPanel();
	JPanel lowerPanel = new JPanel();
	JPanel promptPanel = new JPanel();
	JPanel newGamePanel = new JPanel();
	JPanel left = new JPanel();
	JPanel right = new JPanel();
	JPanel buttonPanel = new JPanel();

	JLabel lblMatchingGame = new JLabel("Match Pairs");
	static JLabel lblTryToMatch = new JLabel("Try To match two squares");

	JRadioButton rdbtnBlue = new JRadioButton("Blue", true);
	JRadioButton rdbtnYellow = new JRadioButton("Yellow", false);
	JRadioButton rdbtnPink = new JRadioButton("Pink", false);
	JButton btnNewGame = new JButton("New Game");

	FlowLayout fl_canvasPanel = new FlowLayout(FlowLayout.CENTER, 5, 5);
	FlowLayout flowLayout = (FlowLayout) left.getLayout();
	FlowLayout flowLayout_1 = (FlowLayout) right.getLayout();

	ButtonGroup btg = new ButtonGroup();

	public GamePanel()
	{
		setBackground(Color.orange);
		setLayout(new BorderLayout(0, 0));

		lblMatchingGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatchingGame.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		add(lblMatchingGame, BorderLayout.NORTH);

		canvasPanel.setBackground(Color.orange);
		canvasPanel.setVisible(true);
		add(canvasPanel, BorderLayout.CENTER);

		canvas.setVisible(true);
		canvasPanel.setLayout(null);
		canvasPanel.setSize(220, 220);

		fl_canvasPanel.setAlignOnBaseline(true);
		canvasPanel.setLayout(fl_canvasPanel);
		canvas.setBackground(Color.blue);
		canvasPanel.add(canvas);

		lowerPanel.setBackground(Color.orange);
		add(lowerPanel, BorderLayout.SOUTH);
		lowerPanel.setLayout(new GridLayout(3, 0, 0, 0));

		promptPanel.setBackground(Color.orange);
		lowerPanel.add(promptPanel);

		promptPanel.add(lblTryToMatch);
		
		buttonPanel.setBackground(Color.orange);
		lowerPanel.add(buttonPanel);

		rdbtnBlue.setMnemonic(KeyEvent.VK_B);
		rdbtnBlue.addActionListener(this);
		

		rdbtnYellow.setMnemonic(KeyEvent.VK_Y);
		rdbtnYellow.addActionListener(this);
		
		rdbtnPink.setMnemonic(KeyEvent.VK_P);
		rdbtnPink.addActionListener(this);
		
		btg.add(rdbtnBlue);
		btg.add(rdbtnYellow);
		btg.add(rdbtnPink);

		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		buttonPanel.add(rdbtnBlue);
		buttonPanel.add(rdbtnYellow);
		buttonPanel.add(rdbtnPink);

		newGamePanel.setBackground(Color.orange);
		lowerPanel.add(newGamePanel);

		btnNewGame.addActionListener(this);
		newGamePanel.add(btnNewGame);

		left.setBackground(Color.orange);
		flowLayout.setHgap(12);
		add(left, BorderLayout.WEST);

		right.setBackground(Color.orange);
		flowLayout_1.setHgap(12);
		add(right, BorderLayout.EAST);
		
	}

	public void actionPerformed( ActionEvent e )
	{
		if (e.getSource() == rdbtnBlue)
		{
			if (rdbtnBlue.isSelected() == true)
			{
				canvas.setBackground(Color.blue);
				System.out.println("blue");
			}
		}
		if (e.getSource() == rdbtnYellow)
		{
			if (rdbtnYellow.isSelected() == true)
			{
				canvas.setBackground(Color.yellow);
				System.out.println("yellow");
			}
		}
		if (e.getSource() == rdbtnPink)
		{
			if (rdbtnPink.isSelected() == true)
			{
				canvas.setBackground(Color.pink);
				System.out.println("pink");
			}
		}
		if (e.getSource() == btnNewGame)
		{
			System.out.println("New Game");
			canvas.reset();
		}
	}
	public void setText(String text)
	{
		lblTryToMatch.setText(text);
	}
}