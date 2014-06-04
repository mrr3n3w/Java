/**
 * 
 */

/**
 * @author Jordan
 * 300219995
 */
public class Function
{
	private static int pos = 0;
	public static void Board()
	{
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

	public static void Turn(int turn)
	{
		int x = turn % 2; 
		switch ( x )
		{
		case 0: 
			System.out.println("X Enter Your Co-Ordinate: ");
			break;
		case 1:
			System.out.println("O Enter Your Co-Ordinate: ");
			break;
		}
		}
	public static void setPos(int pos)
	{
		Function.pos = pos;
	}
	public static void printPosO()
	{
		
		switch ( pos )
		{
		case 1:
			for (int t = 0; t < 10; t++)
			{
					for (int i = 0; i < 2; i++)
					{
						System.out.print("   O   ");
						
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
}