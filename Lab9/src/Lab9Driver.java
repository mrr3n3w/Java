public class Lab9Driver
{
	public static void main( String[] args )
	{
		System.out.printf("%.5f\n", Lab9.squareRoot(25, 25));
		System.out.printf("%.5f\n", Lab9.squareRoot(50, 50));
		System.out.printf("%.5f\n", Lab9.squareRoot(100290, 100290));

		int[] w =
		{ 7, 5, 9, 17, 9, 11, 6 }; // The set of weights
		System.out.print("\nSolution for s = 3: ");
		if (!Lab9.knapsack(3, w, 0))
			System.out.print("No solution.");
		System.out.print("\nSolution for s = 11: ");
		if (!Lab9.knapsack(11, w, 0))
			System.out.print("No solution.");
		System.out.print("\nSolution for s = 19: ");
		if (!Lab9.knapsack(19, w, 0))
			System.out.print("No solution.");
		System.out.print("\nSolution for s = 45: ");
		if (!Lab9.knapsack(45, w, 0))
			System.out.print("No solution.");
		System.out.print("\nSolution for s = 47: ");
		if (!Lab9.knapsack(47, w, 0))
			System.out.print("No solution.");
		System.out.print("\nSolution for s = 56: ");
		if (!Lab9.knapsack(56, w, 0))
			System.out.print("No solution.");
		System.out.print("\nSolution for s = 64: ");
		if (!Lab9.knapsack(64, w, 0))
			System.out.print("No solution.");
		System.out.println();
	}
}