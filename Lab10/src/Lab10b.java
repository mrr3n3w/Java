import java.util.concurrent.*;

public class Lab10b
{
	public static void main( String[] args )
	{
		Operation2 op2 = new Operation2();
		Operation3 op3 = new Operation3();
		ExecutorService myThreadRunner = Executors.newCachedThreadPool();
		myThreadRunner.execute(op2);
		myThreadRunner.execute(op3);
		OperationSimulation op1 = new OperationSimulation("Downloading a file",
				3.5);
		op1.performOperation();
	}
}