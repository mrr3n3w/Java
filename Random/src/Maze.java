/**
 * @author Jordan 300219995
 */
public class Maze
{
	int[][] grid;

	public Maze( int rowDim, int colDim )
	{
		grid = new int[rowDim][colDim];
		// todo constructor
	}

	public boolean traverse( int row, int col )
	{
		boolean done = false;
		if (valid(row, col))
		{
			grid[row][col] = 3; // Tried
			if (row == grid.length && col == grid[row].length)
			{
				done = true;
			} else
			{
				done = traverse(row + 1, col);// south
				if (!done)
				{
					done = traverse(row, col + 1);// east
				}
				if (!done)
				{
					done = traverse(row - 1, col);// north
				}
				if (!done)
				{
					done = traverse(row, col - 1);// west
				}
			}
			if (done)
			{
				grid[row][col] = 7;
			}
		}
		return done;
	}

	public boolean valid( int r, int c )
	{
		return ((r >= 0 && c >= 0) && (r < grid.length && c < grid[r].length) && (grid[r][c] == 1));
	}
}
