/**
 * 
 */

/**
 * @author Jordan
 * 300219995
 */
public class FactorialT3 
{
	public static void main (String [] args)
	{
		System.out.printf("N!\tEquals\n");
		for (int i = 1; i <= 20; i++)
		{
			System.out.printf("%d\t", i);
			System.out.printf("%,d\n", calc(i));
		}
		
	}
		public static long calc(long n)
		{
		    if (n <= 1)
		    {
		        return 1;
		    }
		        else
		        {
		        	return n * calc(n-1);
		        }
		}
	
}
