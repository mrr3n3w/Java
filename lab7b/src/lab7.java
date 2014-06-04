import javax.swing.JFrame;

/**
 * 
 */

/**
 * @author Jordan 300219995
 */
public class lab7 extends JFrame
{
	public static void main( String[] args )
	{
		JFrame myApp = new JFrame();
		myApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GamePanel game = new GamePanel();
		myApp.add(game);
		myApp.setSize(260, 380);
		myApp.setVisible(true);
	}
}
