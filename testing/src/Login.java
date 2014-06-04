/**
 * @author Jordan
 * 300219995
 *
 */

import java.util.Scanner;

public class Login 
{

public static void main(String []args)
{
	for (int t = 0; t < 10; t++)
	{
		for (int i = 0; i < 2; i++)
		{
			System.out.print("       ");
			
			for (int k = 0; k < 1; k++)
			{
				System.out.print("|");
			}
			if (i == 1)
			{
				System.out.print("       ");
			}
		}
		System.out.println();
		if (t == 2 || t == 5 )
		{
			for( int m =0; m < 3; m++)
			{
				System.out.print("_______");
				if (m < 2)
				{
					for (int n = 0; n < 1; n++);
					{
						System.out.print("|");
					}
				}
			}
			System.out.println();
			}
		}
	}
}
