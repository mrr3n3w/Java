/**
 * 
 */

/**
 * @author Jordan
 * 300219995
 */
import java.util.Scanner;

public class Tempurature 
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);
		int[] temps = {0,0,0,0,0,0,0,0,0,0};
		int sum = 0, avg = 0, count = 0;
                boolean[] print = {false,false,false,false,false,false,false,false,false,false,};
		
		for (int i = 0; i < 10; i++)
		{
			System.out.printf("What was the tempurature on Day %d? "
                                            , i+1);
			temps[i] = input.nextInt();
		}
		for(int j = 0; j < 10; j++)
		{
			sum += temps[j];
			avg = sum / 10;
		}
		for(int k = 0; k < 10; k++)
		{
			if(temps[k] > avg)
			{
				count++;
			}
		}
		System.out.printf("The average temperature was %d degrees.\n"
                                    , avg);
		System.out.printf("There were %d days when the temperature was above %d degrees.\n"
                                    , count, avg);
                for(int i =0; i < temps.length; i++)
                {
                    if ( temps[i] > avg || temps[i] == avg)
                    {
                        print[i] = true;
                    }
                    if (print[i] == true)
                    {
                        System.out.printf("Day %d was above average ", i+1 );
                    }
                }
	}
}
