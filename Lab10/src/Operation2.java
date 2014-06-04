/**
 * @author Jordan 300219995
 */
public class Operation2 implements Runnable
{
	public Operation2()
	{
	}

	public void run()
	{
		OperationSimulation op2 = new OperationSimulation(
				"Updating a remote database", 4.5);
		op2.performOperation();
	}
}