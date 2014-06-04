/**
 * 
 */

/**
 * @author Jordan
 * 300219995
 */
public class TrianglesT2 
{
	public static void main(String []args)
	{
		int spaces, stars;
		for(int counter1 = 0; counter1 <= 10; counter1++)
		{
			for (stars = counter1; stars >= 0; stars--)
			{
				System.out.print('*');
			}
			for (spaces = counter1; spaces <= 10; spaces++)
			{
				System.out.print(' ');
			}
			System.out.println();
		}
		System.out.println();
		for(int counter2 = 0; counter2 <= 10; counter2++)
		{
			for (stars = counter2; stars <= 10; stars++)
			{
				System.out.print('*');
			}
			
			for (spaces = counter2; spaces >= 0; spaces--)
			{
				System.out.print(' ');
			}
			System.out.println();
		}
		System.out.println();
		for (int counter3 = 10; counter3 >= 0; counter3--)
		{
			for (spaces = counter3; spaces <= 10; spaces++)
			{
				System.out.print(' ');
			}
			
			for (stars = counter3; stars >= 0; stars--)
			{
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();
		for (int counter4 = 10; counter4 >= 0; counter4--)
		{
			for (spaces = counter4; spaces >= 0; spaces--)
			{
				System.out.print(' ');
			}
			for (stars = counter4; stars <= 10; stars++)
			{
				System.out.print('*');
			}
			System.out.println();
			
		}
		System.out.println();
		
	}
}