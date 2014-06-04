/**
 * @author Jordan
 * 300219995
 */

import java.util.Scanner;

public class Palindrone {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter a 5 Digit Number: ");
		int number = input.nextInt();
		
		if (number == 00000)
		{
			System.out.print("This Is A Palindrone");
			System.exit(0);
		}
		
		while (number > 100000 || number < 10000)
		{
			System.out.print("Not a 5 digit number\n");
			System.out.print("Please Try Again: ");
			number = input.nextInt();
			
			if (number == 00000)
			{
				System.out.print("This Is A Palindrone");
				System.exit(0);
			}
		}
		
		int e = number % 10;
        int divid = number /10;
        
        int d = divid % 10;
        divid = divid / 10;
        
        int c = divid % 10;
        divid = divid / 10;
        
        int b = divid % 10;
        divid = divid /10;
        
        int a = divid % 10;
		
	if (a == e && b ==d)
	{
		System.out.print("This Is A Palindrone");
	}
	else
	{
		System.out.println("This is Not A Palindrone");
	}
	}
}