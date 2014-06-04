/*
 * 300219995
 * Jordan Rowe
 */
public class Joke
{
	public static final int KNOCK_KNOCK = 0;
	public static final int LIGHT_BULB = 1;
	public static final int RIDDLE = 2;
	public static final int PUN = 3;
	public static final int OTHER = -1;
	private String setup;
	private String punchline;
	private int type;

	public Joke( String s, String p, int t )
	{
		setup = s;
		punchline = "";
		if (type != 3)
			punchline = p;
		type = t;
	}

	public String getPunchline()
	{
		return punchline;
	}

	public String getSetup()
	{
		return setup;
	}

	public int getType()
	{
		return type;
	}

	public String toString()
	{
		return "Joke:\n" + setup + "\n" + punchline;
	}
}