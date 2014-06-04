/**
 * 
 */

/**
 * @author Jordan
 * 300219995
 */

import java.util.Random;

public class RandomNumber
{
	public static void main(String[] args)
	{
		
	
		Random number = new Random();
		
		int dice = 0;
		for(int i = 0; i <=3; i++)
		{
			dice = 1 + number.nextInt(6);
			System.out.printf("%d\n", dice);
		}
	}
}

