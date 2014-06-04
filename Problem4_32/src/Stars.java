/**
 * 
 */

/**
 * @author Jordan
 * 300219995
 */


public class Stars 
{
	static int counter;
	
	public static void main (String [] args)
	{
		int counter = 0;
		while(counter < 5)
		{
			
			for (int counter1 = 0; counter1 < 10; counter1++)
			{
				System.out.print("* ");
			}
			System.out.println();
			for (int counter2 = 0; counter2 < 10; counter2++)
			{
				
				System.out.print(" *");
			}
			System.out.println();
			counter++;
		}
		
	}
}
