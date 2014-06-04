public class Problem2
{
	public static void main( String[] args )
	{
		int fib = 0 , last = 1, sum = 0;

		while(fib < 4000000)
		{
			int last1 = last;
			last = fib;
			fib = fib + last1;
			System.out.println(fib);
			if(fib % 2 == 0)
			{
				sum += fib;
			}
		}
		System.out.println();
		System.out.println(sum);
		
	}
}
//int savePrev1 = prev1;
//prev1 = prev2;
//prev2 = savePrev1 + prev2