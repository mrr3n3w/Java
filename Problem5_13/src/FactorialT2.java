/**
 * 
 */

/**
 * @author Jordan
 * 300219995
 */

import java.util.Scanner;
public class FactorialT2 
{
	
	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value:");
		long n = input.nextInt();
		calc(n);
		System.out.printf("Given %d choices the number of options is %d", n , calc(n));
	}
	
		public static long calc(long n){
		    if (n <= 1)
		    {
		        return 1;
		    }
		        else
		        {
		        	return n * calc(n-1);
		        }
	}
}