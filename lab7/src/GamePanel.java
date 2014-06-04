/*
 * Jordan Rowe
 * 300219995
 */
import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel
{
	public GamePanel()
	{
		setLayout(new BorderLayout(0, 0));

		JLabel lblMatchingGame = new JLabel("Match Pairs");
		lblMatchingGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatchingGame.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		add(lblMatchingGame, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_3 = new JPanel();
		add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new GridLayout(3, 0, 0, 0));

		JPanel panel = new JPanel();
		panel_3.add(panel);

		JLabel lblTryToMatch = new JLabel("Try To match two squares");
		panel.add(lblTryToMatch);

		JPanel buttonPanel = new JPanel();
		panel_3.add(buttonPanel);

		ButtonGroup btg = new ButtonGroup();

		JRadioButton rdbtnBlue = new JRadioButton("Blue", true);
		btg.add(rdbtnBlue);

		JRadioButton rdbtnYellow = new JRadioButton("Yellow");
		btg.add(rdbtnYellow);

		JRadioButton rdbtnPink = new JRadioButton("Pink");
		btg.add(rdbtnPink);
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		buttonPanel.add(rdbtnBlue);
		buttonPanel.add(rdbtnYellow);
		buttonPanel.add(rdbtnPink);

		JPanel panel_5 = new JPanel();
		panel_3.add(panel_5);

		JButton btnNewGame = new JButton("New Game");
		panel_5.add(btnNewGame);
		
		JPanel panel_2 = new JPanel();
		add(panel_2, BorderLayout.WEST);
		
		JPanel panel_4 = new JPanel();
		add(panel_4, BorderLayout.EAST);

	}
}
