public class Problem1
{
	public static void main( String[] args )
	{
		int sum = 0;
		// Find the sum of all the multiples of 3 or 5 below 10
		for (int i = 0; i < 10; i++)
		{
			if (i % 3 == 0)
			{
				System.out.println(i);
				sum += i;
			} else if (i % 5 == 0)
			{
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println(sum);
		System.out.println();
		int sum2 = 0;
		// Find the sum of all the multiples of 3 or 5 below 1000
		for (int i = 0; i < 1000; i++)
		{
			if (i % 3 == 0)
			{
				System.out.println(i);
				sum2 += i;
			} else if (i % 5 == 0)
			{
				System.out.println(i);
				sum2 += i;
			}
		}
		System.out.println(sum2);
	}
}
