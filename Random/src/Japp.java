/**
 * @author Jordan
 * 300219995
 */
import java.awt.Color;

import javax.swing.JApplet;
import javax.swing.JFrame;

public class Japp
{
	
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		JApplet app = new JApplet();
		
		app.setBackground(Color.blue);
		app.setVisible(true);
		app.setSize(100,100);
		app.add(frame);
		
//		frame.add(app);
//		frame.setSize(200,200);
//		frame.setVisible(true);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
