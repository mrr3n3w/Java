/**
 * 
 */

/**
 * @author Jordan
 * 300219995
 */
import javax.swing.JFrame;

public class Lab5b
{
	public static void main( String[] args )
	{
		JFrame myApp = new JFrame();
		NamePanel np = new NamePanel();
		myApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		myApp.add(np);
		myApp.setSize(300, 220);
		myApp.setVisible(true);
	}
}
