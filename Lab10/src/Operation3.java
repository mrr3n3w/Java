
/**
 * @author Jordan
 * 300219995
 */
public class Operation3 implements Runnable
{
	public Operation3()
	{
	}

	public void run()
	{
		OperationSimulation op3 = new OperationSimulation(
				"Jordan's operation", 2.4);
		op3.performOperation();
	}
}
