/**
 * @author Jordan
 * 300219995
 */
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;

public class NamePanel extends JPanel
{
	public void paintComponent( Graphics g )
	{
		// Color name of color = new Color(r, g, b);
		String str = "Jordan Rowe";
		super.paintComponent(g);
		setBackground(Color.black);
		g.setColor(Color.WHITE);
		g.fillRect(20, 20, 260, 160);
		g.setColor(Color.red);
		g.fillRect(35, 35, 230, 130);
		g.setColor(Color.white);
		g.fillRect(50, 50, 200, 100);
		for (int i = 0; i < 35; i++)
		{
			g.setColor(new Color(200 - (i * 4), 0, 0));
			g.fillRect(65 + i, 65 + i, 170 - (2 * i), 70 - (2 * i));
		}
		g.setColor(Color.BLUE);
		g.fillOval(80, 80, 140, 40);
		g.setColor(Color.BLACK);
		g.drawOval(80, 80, 140, 40);
		g.setColor(Color.WHITE);
		g.drawString(str, 115, 105);
	}
}