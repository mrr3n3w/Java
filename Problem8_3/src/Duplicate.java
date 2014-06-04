/**
 * @author Jordan
 * 300219995
 */

import java.util.Scanner;

public class Duplicate 
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] darray = new int[5];
		boolean[] contains = {true, true, true, true, true};

		for( int i = 0; i < darray.length; i++ )
		{
			System.out.printf("Enter a number Between 10 - 100: ");
			darray[i] = input.nextInt();
			
			while( darray[i] > 100 || darray[i] < 10)
			{
				System.out.printf("Invalid value try again: " );
				darray[i] = input.nextInt();
			}

                    for (int k = 0; k < darray.length; k++)
                        {
                            if ( (darray[i] == darray[k]))
                            {
                            	if( i != k ) //then it is in a different spot
                            	{
                            		contains[i] = true;
                            		break;
                            	}
                            	else //its the same spot there for it should be the same
                            	{
                            		contains[i] = false;
                            	}
                            }
                            else // if they aren't equal then print
                            {
                                contains[i] = false;
                            }
                        }
                
                        for (int j = 0; j < darray.length; j++ )
                        {
                            if (contains[j] == false)
                            {
                                System.out.printf("%d ", darray[j]);
                            }   
                        }	
                        System.out.println();
            }
        }
}


