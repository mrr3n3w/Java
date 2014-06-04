/**
 * @author Jordan 300219995
 */
public class Lab9
{
	static double next = 0.0;

	public static boolean knapsack( int targetWeight, int[] weights, int index )
	{
		if (index < weights.length)
		{
			if (weights[index] == targetWeight
					|| knapsack(targetWeight - weights[index], weights,
							index + 1))
			{
				System.out.print(weights[index] + " ");
				return true;
			} else
			{
				return knapsack(targetWeight, weights, index + 1);

			}
		} else
		{
			return false;
		}
	}

	public static double squareRoot( double num, double last )
	{
		next = (last + (num / last)) / 2;
		if (Math.abs(next - last) < Math.abs(last * 0.0001))
		{
			return next;
		} else
		{
			return squareRoot(num, next);
		}
	}

}
