/*
 * @student number 	300219995
 * @author  name 	Jordan
 */

import java.util.Random;
import java.util.Scanner;

	public class GameT2 
	{

		@SuppressWarnings("resource")
	public static void main(String []args)
	{
		Random number = new Random();
		int number1 = 1 + number.nextInt(1000);
		Scanner input = new Scanner(System.in);
		long guess = 0;
		int guesses = 0;
		 
		System.out.println("Random Number Guessing Game");
		System.out.println("Values Between 1 - 1000");
		System.out.println("Enter a guess: ");
		guess = input.nextLong();
		
		while (guess != number1)
		{
			if (guess <= number1)
			{
				System.out.println("to low try again");
				System.out.println("Enter a guess: ");
				guess = input.nextLong();
			}
			else 
			{
				System.out.println("to high try again");
				System.out.println("Enter a guess: ");
				guess = input.nextLong();
			}
			guesses++;
		}
		
		System.out.println("Congratulations you guessed right!");
		System.out.printf("%d\n",
				number1);
		System.out.printf("It took you %d guesses", 
				guesses);
		
		
	}
}
