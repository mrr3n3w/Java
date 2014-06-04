/**
 * @author Jordan
 * 300219995
 */

import java.util.Scanner;

public class Hollow {

	public static void main(String[] args) 
	{
	
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a Size: ");
		int topBot = input.nextInt();
		int middleStars = topBot - 2 ;
		int spaces = topBot - 2;
		int origM = spaces;
		int origT = topBot;
		
		if (topBot > 0)
		{
		if (topBot == 1)
		{
			System.out.print("*");
			System.exit(0);
		}
		if (topBot == 2)
		{
			System.out.println("* *");
			System.out.println("* *");
			System.exit(0);
		}
		}
		while (topBot > 0)
		{
			System.out.print("* ");
			topBot--;
		}
			topBot = origT;
			System.out.print("\n");
		
		while (middleStars > 0)
		{
			System.out.print("* ");
			
			while (spaces > 0)
			{
				System.out.print("  ");
				spaces--;
			}
			spaces = origM;
			
			System.out.print("*\n");
			middleStars--;
		}
		
		while (topBot > 0)
		{
			System.out.print("* ");
			topBot--;
		}

		}

	}

