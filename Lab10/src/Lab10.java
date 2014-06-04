/**
 * @author Jordan 300219995
 */
public class Lab10
{
	public static void main( String[] args )
	{
		Operation2 op2 = new Operation2();
		OperationSimulation op3 = new OperationSimulation("Jordan's operation",
				2.4); // Use your first name
		Thread t1 = new Thread(op2);
		t1.start();
		OperationSimulation op1 = new OperationSimulation("Downloading a file",
				3.5);
		

		op1.performOperation();
	}
}