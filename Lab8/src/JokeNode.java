/**
 * 
 */

/**
 * @author Jordan 300219995
 */

public class JokeNode
{
	private JokeNode head;
	Joke theJoke;
	JokeNode next;

	JokeNode( Joke j, JokeNode n )
	{
		theJoke = j;
		next = n;
	}
}