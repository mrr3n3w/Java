public class Problem3
{

	public static void main( String[] args )
	{
		// prime factors of
		// 600851475143
		long num = 600851475143l;
		long[] primes = new long[100];
		for (int k = 0; k < primes.length; k++)
		{
			for (int i = 2; i < primes.length; i++)
			{
				
				for (int j = 2; j < i; j++)
				{
					if (i % j == 0)
					{
						break;
					}else
					{
						primes[k] = i;
						break;
					}
				}
				break;
			}
		}
		for (int i = 0; i < primes.length; i++)
		{
			System.out.println(primes[i]);
		}
		for (int i = 0; i < primes.length; i++)
		{
			// System.out.println(num / primes[i]);
		}
	}

}
