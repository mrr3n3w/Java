/*
 * Jordan Rowe
 * 300219995
 */
import javax.swing.*;
import java.io.*;

public class JokeList
{
	private Joke[] jokes;
	private int jokeCount;
	private String jokeFile;

	public JokeList( String jf )
	{
		jokeFile = jf;
		jokeCount = 0;
		jokes = new Joke[10]; // make room for up to 20 Jokes
		populateJokes();
	}

	private void populateJokes()
	{
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(jokeFile));
			br.mark(50000); // allows 50000 characters to be handled
			while ((br.readLine()) != null)
			{
				jokeCount++;
			}
			;
			br.reset();
			jokeCount = jokeCount / 3;
			if (jokeCount > 10)
			{
				jokeCount = 10; // The array only holds 10 jokes.
			}
			for (int i = 0; i < jokeCount; i++)
			{
				jokes[i] = new Joke(br.readLine(), br.readLine(),
						Integer.parseInt(br.readLine()));
			}
		} catch (IOException e)
		{
			String msg = "Verify that the "
					+ jokeFile
					+ " file exists and is spelled correctly in the specified folder.";
			JOptionPane.showMessageDialog(null, msg);
			e.printStackTrace();
			System.exit(1);
		}
	}

	public Joke[] getJokeArray()
	{
		Joke[] jokeArray = new Joke[jokeCount];
		for (int i = 0; i < jokeArray.length; i++)
			jokeArray[i] = jokes[i];
		return jokeArray;
	}

	// Add a new joke to the end of the list
	public void addJoke( String setup, String pline, int type )
	{
		if (jokeCount < 10)
		{
			jokes[jokeCount] = new Joke(setup, pline, type);
			jokeCount++;
		}
	}
}