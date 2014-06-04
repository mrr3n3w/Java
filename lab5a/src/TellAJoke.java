/**
 * @author Jordan
 * 300219995
 */
import javax.swing.*;

public class TellAJoke
{
	public static void main( String[] args )
	{
		JOptionPane.showMessageDialog(null, "The Jokester");
		String name = JOptionPane.showInputDialog("What is your name?");
		String greetMsg = "Hello, " + name
				+ ".\nWould you like to hear a Joke?";
		int ans = JOptionPane.showConfirmDialog(null, greetMsg, "Jokester",
				JOptionPane.YES_NO_OPTION);
		
		if (ans == JOptionPane.YES_OPTION)
		{
			String msg = "Would you like to know how many procrastinators it takes to screw in a lightbulb?";
			JOptionPane.showMessageDialog(null, msg, "Jokester",
					JOptionPane.OK_OPTION);
			JOptionPane.showMessageDialog(null,
					"One, but he has to wait until the lighting is better.");
			String prompt = "Would you like to hear another?";
			ans = JOptionPane.showConfirmDialog(null, prompt, "Jokester",
					JOptionPane.YES_NO_OPTION);
		
			if (ans == JOptionPane.YES_OPTION)
			{
				msg = "Two kittens on a sloped roof. Which one slides first?";
				JOptionPane.showMessageDialog(null, msg, "Jokester",
						JOptionPane.OK_OPTION);
				JOptionPane.showMessageDialog(null,
						"The one with the lowest mew.");
			}
			else
			{
				msg = "Fun Fact!\n\"" + "A 'jiffy' is an actual unit of time for 1/100th of a second.\"";
				JOptionPane.showMessageDialog(null, msg);
			}
		} 
		
		else
		{
			String msg = "OK. Here's a fun fact.\n\n\""
					+ "Banging your head against a wall uses 150 calories an hour.\"";
			JOptionPane.showMessageDialog(null, msg);
		}
	}
}
