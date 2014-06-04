/**
 * @author Jordan 300219995
 */
public class SortingAlgorithms
{
	public void bubbleSort( int[] a )
	{
		for (int i = 0; i < a.length - 1; i++)
		{
			for (int h = a.length - 2; h >= i; h--)
			{
				if (a[h] > a[h + 1])
				{
					swap(a, h, h + 1);
				}
			}
		}
	}

	public void selectionSort( int[] a )
	{
		int minIndex;
		for (int i = 0; i < a.length - 1; i++)
		{
			minIndex = 0;
			for (int k = 0; k < a.length - 2; k++)
			{
				if (a[k] < a[minIndex])
					minIndex = k;
			}
			swap(a, minIndex, i);
		}
	}

	public void insertionSort( int[] a )
	{

		int j, i, key;

		for (j = 1; j < a.length; j++)
		{
			key = a[j];
			for (i = j - 1; (i >= 0) && (a[i] < key); i--)
			{
				a[i + 1] = a[i];
			}
			a[i + 1] = key;
		}
	}

	public static void quickSort( int[] a, int p, int r )
	{
		if (p < r)
		{
			int q = partition(a, p, r);
			quickSort(a, p, q);
			quickSort(a, q + 1, r);
		}
	}

	private static int partition( int[] a, int p, int r )
	{

		int x = a[p];
		int i = p - 1;
		int j = r + 1;

		while (true)
		{
			i++;
			while (i < r && a[i] < x)
				i++;
			j--;
			while (j > p && a[j] > x)
				j--;

			if (i < j)
				swap(a, i, j);
			else
				return j;
		}
	}

	public static void swap( int[] a, int k, int j )
	{
		int temp = 0;
		a[k] = temp;
		a[k + 1] = a[k];
		temp = a[k + 1];
	}

}
