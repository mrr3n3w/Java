/**
 * @author Jordan
 * 300219995
 */
import java.util.Scanner;

public class Income 
{
	public static void main (String [] args)
	{
		@SuppressWarnings ("resource")
		Scanner input = new Scanner(System.in);
		int k = 0, count = 0;
		double max = 0, less = 0;
               
		
		System.out.printf("How Many families are you calculating? ");
		k = input.nextInt();
		double[] income = new double[k];
		boolean print[] = new boolean[income.length];
                
		for(int j = 0; j < k; j++)
		{
			System.out.printf("What does family %d make per year? ", j + 1);
			income[j] = input.nextDouble();
		}
		for(int l = 0; l < k; l++)
		{
			if( income[l] > max )
			{
				max = income[l];
			}
			else 
			{
				continue;
			}
			
			less = max * .1;

		}
		for(int i = 0; i < k; i++)
		{
			if( income[i] <= less)
			{
				count++;
			}
		}
		System.out.printf("The max income entered was $%.2f.\n", max);
		System.out.printf("There are %d families below $%.2f.", count, less);
                for(int i =0; i < income.length; i++)
                {
                    if ( income[i] > less || income[i] == less)
                    {
                        print[i] = true;
                    }
                    if (print[i] == true)
                    {
                        System.out.printf("Family %d was above average \n", i+1 );
                    }
	}
    }
}