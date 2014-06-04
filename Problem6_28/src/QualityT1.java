/**
 * 
 */

/**
 * @author Jordan
 * 300219995
 */
import java.util.Scanner;

public class QualityT1 
{
	public static int qualityPoints(int grade)
	{
		
		if (grade == 60)
				return 0;
		else if (grade >= 61 && grade <= 69)
			return 1;
		else if (grade >= 70 && grade <= 79)
			return 2;
		else if (grade >= 80 && grade <= 89)
			return 3;
		else if (grade >= 90 && grade <= 100)
			return 4;
		else
			return 0;
		
	}
	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);
		int grade = 1;
		
		while (grade  > 0)
		{
			System.out.println("Enter a grade or -1 to exit:");
			grade = input.nextInt();
			System.out.println(qualityPoints(grade));
		}
	}
}
