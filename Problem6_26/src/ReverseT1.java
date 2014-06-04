import java.util.Scanner;

/**
 * 
 */

/**
 * @author Jordan
 * 300219995
 */
@SuppressWarnings("resource")

public class ReverseT1 
{
	public static long Reverse(String number)
	{
		long length1 = number.length();
		long number1 = Long.parseLong(number);
		long a1;
		long sum = 0;
		long number2 = 0;
		number2 = number1;
		
		for (long count = length1; count > 0; count--)
		{
			a1 = number1 % 10;
			number2 = number2 - a1;
			number2 = (long) (a1 * Math.pow(10, count - 1));
			sum = sum + number2;
			number1 = number1 /10;
		}
			return sum;
	}
	
	public static void main (String []args)
	{

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value: ");
		String number = input.nextLine();
		System.out.print(Reverse(number));
	}
}
