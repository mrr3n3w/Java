/*
 * Jordan Rowe
 * 
 * 300219995
 */
import javax.swing.*;

public class lab7 extends JFrame
{
	public static void main( String[] args )
	{
		JFrame myApp = new JFrame();
		myApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GamePanel game = new GamePanel();
		myApp.add(game);
		myApp.pack();
		myApp.setVisible(true);
	}
}