/**
 * 
 */

/**
 * @author Jordan
 * 300219995
 */
import java.util.Random;
import java.util.Scanner;

public class GameT3 
{
	private static int entered;
	private static int real;
	private static final Random number = new Random();
	private static int real1, real2, name;
	private static Scanner input = new Scanner(System.in);
	private static int counter;
	
	
	public static void setAnswerR(int name)
	{
		real = name;
	}
	public static int getAnswerR()
	{
		return real;
	}
	public static void setAnswerE(int name)
	{
		entered = name;
	}
	public static int getAnswerE()
	{
		return entered;
	}
	public static void generate()
	{
		
		real = 1 + number.nextInt(10);
		real1 = real;
		real = 1 + number.nextInt(10);
		real2 = real;
		real = real1 * real2;
		
	}
	public static void printProb()
	{
		System.out.printf("%d * %d\n", 
				real1, real2);
		System.out.println("Enter a guess:");
		name = input.nextInt();
		setAnswerE(name);
		
	}
	public static void test()
	{
		for(counter = 0; counter < 20; counter++)
		{
			if (entered != real)
			{
				System.out.println("Try again");
				name = input.nextInt();
				setAnswerE(name);
			}
			if (entered == real)
			{
				System.out.println("Good Job!");
				generate();
			}
			printProb();
		}
	}
	public static void main (String [] args)
	{
		generate();
		printProb();
		test();
		
	}
}
