/**
 * @author Jordan 300219995
 */
public class OperationSimulation
{
	private double delay; // time needed for this operation in seconds
	private String opName;

	public OperationSimulation( String opn, double dly )
	{
		opName = opn;
		delay = dly;
	}

	public void performOperation()
	{
		int i = 0;
		while (i < delay)
		{
			try
			{
				Thread.sleep(999);
			} catch (InterruptedException ie)
			{
			}
			i++;
			System.out.println("Operation - " + opName + ": Still Waiting (~"
					+ i + " seconds)");
		}
	}
}