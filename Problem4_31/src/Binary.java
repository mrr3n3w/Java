/**
 * @author Jordan
 * 300219995
 */
import java.util.Scanner;

public class Binary 
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Binary Value: ");
		String number = input.nextLine();
		long length1 = number.length();
		long number1 = Long.parseLong(number);
		int base = 1;
		long a1;
		
		System.out.printf("Value Entered: %d\n",
				number1);
		
		long sum = 0;
				
		for (int count = 0; count < length1; count++)
		{
			a1 = number1 % 10;
			a1 = a1 * base;
			base *=2;
			sum = a1 + sum;
			number1 = number1 / 10;
		}
		
		System.out.printf("In Decimal: %d", 
					sum );
		}
	}