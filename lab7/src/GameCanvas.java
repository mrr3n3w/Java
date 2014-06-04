import javax.swing.JPanel;

import java.awt.*;

/**
 * 
 */

/**
 * @author Jordan
 * 300219995
 */
public class GameCanvas extends JPanel
{

	/**
	 * Create the panel.
	 */
	public GameCanvas()
	{
		setLayout(null);
		
		Canvas canvas = new Canvas();
		canvas.setBounds(0, 0, 220, 200);
		add(canvas);
		

	}
	void drawGrid()
	{
		Graphics g = null;
		for(int i = 0; i < 4; i++)
		{
			g.drawLine(55, 55, 220, 220);
		}
	}
}
