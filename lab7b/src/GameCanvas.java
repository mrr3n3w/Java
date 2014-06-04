import javax.swing.*;

import java.util.Random;
import java.awt.*;
import java.awt.event.*;

/**
 * @author Jordan 300219995
 * 
 */
public class GameCanvas extends Canvas implements MouseListener
{
	private String path = "/Users/Jordan/Google Drive/workspace/lab7b/src/";

	Random r = new Random();

	private int cellN = 4;
	private int counter = 0;
	private final int cellW = 50;
	private int dimension, x1, x2, y1, y2;
	private int turnCount = 0;
	boolean firstTurn = true;
	String first, second;
	Boolean[][] showing, finalShowing;
	Canvas canvas = new Canvas();

	ImageIcon[] list = new ImageIcon[8];
	ImageIcon[] fullList = new ImageIcon[16];
	ImageIcon[][] master = new ImageIcon[4][4];

	public GameCanvas( int sizeW, int sizeH, int col )
	{
		cellN = col;
		dimension = cellN * cellW;
		showing = new Boolean[cellN][cellN];
		finalShowing = new Boolean[cellN][cellN];
		setSize(sizeW, sizeH);
		populateImages();
		createFull();
		reset();
		addMouseListener(this);
	}

	private void populateImages()
	{
		/*
		 * this method creates the array that stores the original 8 images
		 */
		for (int i = 0; i < 8; i++)
		{
			list[i] = new ImageIcon(path + "image" + i + ".jpg");// "c:/cosc121/image"+i+".jpg");
		}
	}

	public void paint( Graphics g )
	{

		counter = 0;
		// draw image if it has been clicked
		for (int x = 0; x < cellN; x++)
		{
			for (int y = 0; y < cellN; y++)
			{
				/*
				 * using two separate variables to avoid accidental turn overs
				 */
				if (showing[x][y] == true || finalShowing[x][y] == true)
				{
					g.drawImage(master[x][y].getImage(), x * cellW + 3, y
							* cellW + 3, this);
				}
			}
		}
		// draw board
		for (int i = 0; i <= dimension; i += cellW)
		{
			g.drawLine(i, 0, i, dimension);
		}
		for (int i = 0; i <= dimension; i += cellW)
		{
			g.drawLine(0, i, dimension, i);
		}
	}

	private void ShuffleArray( ImageIcon[] array )
	{
		/*
		 * shuffle array randomizes the array that is passed to it using a
		 * simple shuffle method and also sets the values of showing to all
		 * false
		 */
		int index;
		ImageIcon temp;
		Random random = new Random();
		for (int i = array.length - 1; i > 0; i--)
		{
			index = random.nextInt(i + 1);
			temp = array[index];
			array[index] = array[i];
			array[i] = temp;
		}
		for (int i = 0; i < showing.length; i++)
		{
			for (int j = 0; j < showing[i].length; j++)
			{
				showing[i][j] = false;
				finalShowing[i][j] = false;
			}
		}
	}

	public void createFull()
	{
		/*
		 * createFull generates the full list of 16 tiles on the board then
		 */
		counter = 0;
		for (int i = 0; i < cellN*cellN; i++)
		{
			fullList[i] = list[counter];
			if (counter < 7)
			{
				counter++;
			} else
			{
				counter = 0;
			}
		}
	}

	public void createMaster()
	{
		/*
		 * createMaster copies the full list into the two dimensional array
		 */
		counter = 0;
		for (int x = 0; x < cellN; x++)
		{
			for (int y = 0; y < cellN; y++)
			{
				master[x][y] = fullList[counter];
				counter++;
			}
		}
	}

	public void reset()
	{
		/*
		 * straight forward re-shuffle the board re-generate the master list
		 * turn all the tiles over and re-set the prompt
		 */
		ShuffleArray(fullList);
		createMaster();
		for (int x = 0; x < cellN; x++)
		{
			for (int y = 0; y < cellN; y++)
			{
				showing[x][y] = false;
				finalShowing[x][y] = false;
			}
		}
		GamePanel.lblTryToMatch.setText("Try To match two squares");
		firstTurn = true;
		repaint();
	}

	public void show( int x, int y )
	{
		/*
		 * the show method is used by mouse click events to set the value of
		 * showing to be true
		 */
		showing[x - 1][y - 1] = true;
	}

	public void flip( int x, int y )
	{
		/*
		 * flips the tile back over only called if no match
		 */
		if (x != 0 || y != 0)
		{
			showing[x - 1][y - 1] = false;
		}
	}

	public boolean gameOver()
	{
		/*
		 * gameOver() checks to see if the game is finished
		 */
		for (int i = 0; i < finalShowing.length; i++)
		{
			for (int j = 0; j < finalShowing[i].length; j++)
			{
				if (finalShowing[i][j] == false)
				{
					return false;
				} else
					return true;
			}
		}
		return false;
	}

	public Boolean Final( int x, int y )
	{
		/*
		 * final() checks to see if the tile has already been matched
		 */
		if (x != 0 || y != 0)
		{
			if (finalShowing[x - 1][y - 1] == true)
			{
				return true;
			} else
			{
				return false;
			}
		}
		return false;
	}

	public void check( int x, int y )
	{
		show(x, y); // show the tile
		if (firstTurn == true)
		{
			flip(x1, y1);
			flip(x2, y2);
			first = null;
			x1 = 0;
			y1 = 0;
			x2 = 0;
			y2 = 0;
			x1 = x;
			y1 = y;
			first = master[x - 1][y - 1].getDescription();
			firstTurn = false;
		} else if (firstTurn == false)
		{
			second = null;
			x2 = x;
			y2 = y;
			second = master[x - 1][y - 1].getDescription();
			firstTurn = true;
		}

		if (x1 == x2 && y1 == y2)
		{
			firstTurn = false;
		} else if (Final(x, y) == true)
		{
			firstTurn = true;

		}

		if (first == second && firstTurn == true)
		{
			finalShowing[x1 - 1][y1 - 1] = true;
			finalShowing[x2 - 1][y2 - 1] = true;
			GamePanel.lblTryToMatch.setText("Match!");
			turnCount++;
		} else if (first != second && firstTurn == true)
		{
			GamePanel.lblTryToMatch.setText("No Match!");
			turnCount++;
		}
		if (gameOver())
		{
			GamePanel.lblTryToMatch.setText("You Won! It took you " + turnCount
					+ " tries!");
		}
	}

	public void mouseClicked( MouseEvent me )
	{

		if (me.getX() >= 0 && me.getX() <= 50)
		{
			if (me.getY() >= 0 && me.getY() <= 50)
			{
				check(1, 1);
				repaint();
			} else if (me.getY() >= 50 && me.getY() <= 100)
			{
				check(1, 2);
				repaint();
			} else if (me.getY() >= 100 && me.getY() <= 150)
			{
				check(1, 3);
				repaint();
			} else if (me.getY() >= 150 && me.getY() <= 200)
			{
				check(1, 4);
				repaint();
			}
		}
		if (me.getX() >= 50 && me.getX() <= 100)
		{
			if (me.getY() >= 0 && me.getY() <= 50)
			{
				check(2, 1);
				repaint();
			} else if (me.getY() >= 50 && me.getY() <= 100)
			{
				check(2, 2);
				repaint();
			} else if (me.getY() >= 100 && me.getY() <= 150)
			{
				check(2, 3);
				repaint();
			} else if (me.getY() >= 150 && me.getY() <= 200)
			{
				check(2, 4);
				repaint();
			}
		}
		if (me.getX() >= 100 && me.getX() <= 150)
		{
			if (me.getY() >= 0 && me.getY() <= 50)
			{
				check(3, 1);
				repaint();
			} else if (me.getY() >= 50 && me.getY() <= 100)
			{
				check(3, 2);
				repaint();
			} else if (me.getY() >= 100 && me.getY() <= 150)
			{
				check(3, 3);
				repaint();
			} else if (me.getY() >= 150 && me.getY() <= 200)
			{
				check(3, 4);
				repaint();
			}
		}
		if (me.getX() >= 150 && me.getX() <= 200)
		{
			if (me.getY() >= 0 && me.getY() <= 50)
			{
				check(4, 1);
				repaint();
			} else if (me.getY() >= 50 && me.getY() <= 100)
			{
				check(4, 2);
				repaint();
			} else if (me.getY() >= 100 && me.getY() <= 150)
			{
				check(4, 3);
				repaint();
			} else if (me.getY() >= 150 && me.getY() <= 200)
			{
				check(4, 4);
				repaint();
			}
		}
	}

	public void mousePressed( MouseEvent me )
	{
	}

	public void mouseReleased( MouseEvent me )
	{
	}

	public void mouseEntered( MouseEvent me )
	{
	}

	public void mouseExited( MouseEvent me )
	{
	}

	public int getRandomInt( int min, int max )
	{
		return r.nextInt(max - min) + min;
	}
}