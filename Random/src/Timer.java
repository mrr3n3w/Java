import java.util.concurrent.Callable;
/**
 * @author Jordan 300219995
 */
public class Timer
{
	/*
	 * Timer takes a recursive and non
	 * recursive method and will time them
	 * both 100000 times and tell you which 
	 * is faster take this information with 
	 * a grain of salt because it is dependent 
	 * on your computer.
	 * 
	 */
	@SuppressWarnings( "rawtypes" )
	public String timer( Callable r, Callable n ) throws Exception, Throwable
	{
		float sum1 = 0, sum2 = 0;
		int count = 1;
		long startTime;
		long endTime;
		long duration = 0;

		while (count <= 100000)
		{
			startTime = System.nanoTime();
			r.call();
			endTime = System.nanoTime();

			duration = endTime - startTime;
			sum1 += duration;
			System.out.println(duration);

			startTime = System.nanoTime();
			n.call();
			endTime = System.nanoTime();

			duration = endTime - startTime;
			sum2 += duration;
			System.out.println(duration);
			count++;
		}

		if (sum1 / 100000 > sum2 / 100000)
		{
			return ("recursive\n" + "By " + (sum1 - sum2) / 100000 + "milliseconds");
		} else
		{
			return ("Non - recursive\n" + "By " + (sum2 - sum1) / 100000 + "milliseconds");
		}
	}
}
