/**
 * @author Jordan
 * 300219995
 */
import java.util.Scanner;

public class HollowT2 
{
	public static void main(String [] args)
	{
		int entered = 0;
		int counter;
		int middleStars = 0;
		int spaces = 0;
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter a Size: ");
		entered = input.nextInt();

		if (entered > 0)
		{
		if (entered == 1)
		{
			System.out.print("*");
			System.exit(0);
		}
		if (entered == 2)
		{
			System.out.println("* *");
			System.out.println("* *");
			System.exit(0);
		}
		}
		
		for (counter = 0; counter < entered; counter++)
		{
			System.out.print("* ");
		}
		for (middleStars = entered - 2; middleStars > 0; middleStars--)
		{
			System.out.print("* ");
		}
		for (spaces = entered - 2; spaces > 0; spaces--)
		{
		System.out.print("  ");
		}
	
		for (middleStars = entered -2; middleStars > 0; middleStars--)
		{
		System.out.print("*\n");
		}
		

		for (counter = 0; counter < entered; counter++)
		{
		System.out.print("* ");
		}
	}
}


