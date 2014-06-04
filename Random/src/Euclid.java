/**
 * @author Jordan 300219995
 */
public class Euclid
{
	static Timer t = new Timer();

	public static int GCDR( int a, int b ) // recursive
	{
		if (b == 0)
		{
			return a;
		} else
			return GCDR(b, a % b);
	}

	public static int GCD( int a, int b )// non recursive
	{
		while (b != 0)
		{
			int t = b;
			b = a % b;
			a = t;
		}
		return a;
	}

	public static void main( String[] args )
	{
		System.out.println(GCDR(21,16));
	}
}
