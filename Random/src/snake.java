import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JApplet;

/**
 * A simple snake game. The program opens with a welcome message and after the
 * user clicks the screen with the mouse, it will initiate the game. The snake
 * will start moving immediately to the left, but when if the arrow keys are
 * pressed then the direction of the snake will change. If the snake eats the
 * red apple, then snake will grow and a new apple will be generated in a new
 * random location. If the snake crashes into itself or the walls then the
 * animation stops and a game over message is displayed. The user can then press
 * Enter to exit the program.
 * 
 * 
 */
public class snake extends JApplet implements MouseListener, KeyListener,
		Runnable, ComponentListener
{
	// Holds the coordinates for the snake and the apple.
	int snakeX, snakeY, appleX, appleY;

	// Holds the values for the width and height of the snake.
	int snakeW, snakeH;

	// Holds the value of the direction (0, 1, 2, 3)
	int dir = 0;

	// Keeps track of the score.
	int score;

	// Keeps track of how many pieces there are in the snake's body.
	int pieces;

	// Used to determine if the mouse is clicked to clear away the welcome
	// message to initiate the game.
	boolean notClicked = true;

	// Used to update the loop for the thread if the game is still running.
	boolean animating = true;

	// Holds the x coordinate of each piece of the snake.
	ArrayList<Integer> xList = new ArrayList<Integer>();
	// Holds the y coordinate of each piece of the snake.
	ArrayList<Integer> yList = new ArrayList<Integer>();

	// the surface we're going to draw to
	private Image m_RenderTarget = null;
	// the graphics object belonging to the surface we'll draw to
	private Graphics m_BufferedGraphics = null;

	public void init()
	{
		this.addMouseListener(this);
		this.addKeyListener(this);
		this.setFocusable(true);

		// making the window a little bigger than the default
		setSize(600, 600);
		// this will notify us when the component is resized (in our case it's
		// the applet window)
		addComponentListener(this);
		// calling this here will create the image to paint to and the buffered
		// graphics object
		componentResized(null);

		Thread t = new Thread(this);
		t.start();

		snakeX = 400;
		snakeY = 400;

		appleX = 200;
		appleY = 100;

		snakeW = 10;
		snakeH = 10;

		dir = 0;

		score = 0;

		// Has an initial value of 1 because the first piece will be the head.
		pieces = 1;

	}

	/**
	 * Used to prevent flickering in the program. Calls drawAll which calls the
	 * other drawing methods.
	 */
	public void paint( Graphics g )
	{
		// draw some stuff to the buffered graphics object
		drawAll(m_BufferedGraphics);

		// this paints the image we've been drawing to, to the screen
		g.drawImage(m_RenderTarget, 0, 0, this);
	}

	/**
	 * Clears the background and calls the other drawing methods for the welcome
	 * message, the apple, and the snake.
	 * 
	 * @param g
	 */
	public void drawAll( Graphics g )
	{
		// Clear the background
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());

		// Displays the welcome message until the user clicks the screen.
		// Then the welcome message is cleared away and the game begins.
		if (notClicked)
			this.welcomeMessage(g);

		// Once the user clicks, these methods are called to draw the snake
		// and apple.
		if (!notClicked)
		{
			this.snakePos(g);
			this.apple(g);
		}
		// Checks to see what the coordinates are for the apple and snake
		// to see if they are on the same 'grid' system.
		// System.out.println(appleX + " " + appleY);
		// System.out.println(snakeX + " " + snakeY);
//		System.out.println("Snake has this many pieces " + pieces);
//		System.out.println("x's are " + xList);
//		System.out.println("y's are " + yList);
//		System.out.println("size x is " + xList.size());
//		System.out.println("size  y is " + yList.size());
	}

	/**
	 * First drawn to the screen. Will clear away when the user clicks with the
	 * mouse.
	 * 
	 * @param g
	 */
	public void welcomeMessage( Graphics g )
	{
		// Display the welcome message and instructions
		g.setColor(Color.WHITE);
		g.drawString("Welcome to Snake!", this.getWidth() / 3,
				this.getHeight() / 2);
		g.drawString("Use the arrow keys to move the snake.",
				this.getWidth() / 3, this.getHeight() / 2 + 15);
		g.drawString("Eat the red apples to grow.", this.getWidth() / 3,
				this.getHeight() / 2 + 30);
		g.drawString("Don't run into the walls or yourself or the game ends",
				this.getWidth() / 3, this.getHeight() / 2 + 45);
		g.drawString("When you are ready play click with the mouse",
				this.getWidth() / 3, this.getHeight() / 2 + 60);
	}

	/**
	 * Draws the snake's head. Calls the method for the snake's body if the x
	 * and y coordinates of the snake an apple are the same. Also checks to see
	 * if the snake has crashed into the wall. If it has then the game over
	 * method is called.
	 * 
	 * @param g
	 */
	public void drawSnake( Graphics g, int x, int y )
	{
		// Draw the snake.
		g.setColor(Color.GREEN);

		g.fillRect(x, y, snakeW, snakeH);

		// Checks for wall crashings.
		if (snakeX < 0)
			gameOverMessage(g);
		if (snakeX > this.getWidth())
			gameOverMessage(g);
		if (snakeY < 0)
			gameOverMessage(g);
		if (snakeY > this.getHeight())
			gameOverMessage(g);
	}

	/**
	 * Get's the coordinates for x and y of each piece of the snake. These
	 * values are stored in the arraylists xList and yList. Then these values
	 * are sent to drawSnake as parameters to update how many pieces need to be
	 * drawn and where they need to be drawn.
	 * 
	 */
	public void snakePos( Graphics g )
	{
		// These are the initial coordinates for the head. They will be fed
		// into the arraylist to get it started with a size of 1.
		int initialX = 400;
		int initialY = 400;

		// If the size of the lists are 0 then it will add the initial values
		// once to get the list started. Afterwards, any changes to the x or
		// y coordinates will be handled by the if statement below.
		if (xList.size() == 0)
			xList.add(initialX);
		if (yList.size() == 0)
			yList.add(initialY);

		// Store the location at the index equal to k which is the current index
		// that is being changed. For each piece it will check what direction it
		// is
		// in and then store the appropriate coordinates for that piece.
		for (int i = 0; i < pieces; i++)
		{
			if (dir == 0)
				for (int k = xList.size() - 1; k >= 0; k--)
				{
					xList.set(i, snakeX - 10);
					yList.set(i, snakeY);
				}
			if (dir == 1)
				for (int k = xList.size() - 1; k >= 0; k--)
				{
					xList.set(i, snakeX + 10);
					yList.set(i, snakeY);
				}
			if (dir == 2)
				for (int k = yList.size() - 1; k >= 0; k--)
				{
					xList.set(i, snakeX);
					yList.set(i, snakeY - 10);
				}
			if (dir == 3)
				for (int k = yList.size() - 1; k >= 0; k--)
				{
					xList.set(i, snakeX);
					yList.set(i, snakeY + 10);
				}
		}
		for (int i = 0; i < pieces; i++)
		{
			int x = xList.get(i);
			int y = yList.get(i);

			drawSnake(g, x, y);
		}

	}

	/**
	 * Draws the apple. When the x and y coordinates are the same, then the
	 * apple will be redrawn in a new location with randomly generated
	 * coordinates. This method calls the applePos method which will generate a
	 * new location for the apple.
	 * 
	 * @param g
	 */
	public void apple( Graphics g )
	{
		// Generates a random coordinate for the apple when it gets eaten.
		g.setColor(Color.RED);
		g.fillOval(appleX, appleY, 10, 10);
		applePos(g);
	}

	/**
	 * Generates a new x and y coordinate for the apple if the snake's location
	 * and apple's location are the same. If new random location exceeds a
	 * certain range then it will regenerate a new location which fits the
	 * window size. It also updates the score count.
	 * 
	 */
	Random r = new Random();

	public void applePos( Graphics g )
	{
		if (snakeX == appleX && snakeY == appleY)
		{
			// Update the score.
			score++;

			// Update the number of snake body pieces there are.
			pieces++;

			// Add the coordinates for the new piece every time the x and y
			// for the snake and apple are the same.
			xList.add(snakeX);
			yList.add(snakeY);

			appleX = r.nextInt(this.getWidth()) * 10;
			appleY = r.nextInt(this.getHeight()) * 10;

			// If the new apple coordinates exceed the window, then it will
			// reselect better coordinates.
			while (appleX > 700 || appleY > 700)
			{
				appleX = r.nextInt(50) * 10;
				appleY = r.nextInt(50) * 10;
			}
		}
		repaint();
	}

	/**
	 * Displayed if the snake crashes into the wall or itself. Will display that
	 * the game is over, the score, and how to exit the program (the user will
	 * press Enter).
	 * 
	 * @param g
	 */
	public void gameOverMessage( Graphics g )
	{
		animating = false;
		g.setColor(Color.WHITE);
		g.drawString("Game Over", this.getWidth() / 3, this.getHeight() / 3);
		g.drawString("Your score was " + score, this.getWidth() / 3,
				this.getHeight() / 3 + 15);
		g.drawString("Hit Enter to exit", this.getWidth() / 3,
				this.getHeight() / 3 + 30);
	}

	public void mouseClicked( MouseEvent e )
	{
		// Initiates the game when the user clicks the mouse

		// Confirms that click events are recognized by the applet.
		// System.out.println("mouse clicked");

		// Gets rid of the welcome message.
		if (e.getButton() == MouseEvent.BUTTON1)
		{
			notClicked = false;
			repaint();
		}
	}

	/**
	 * Moves the snake continuously in one direction unless the key events reset
	 * the value of the dir variable which holds the value 0-3 that is sent to
	 * the moveSnake method for the direction variable to set the direction.
	 * 
	 * @param direction
	 */
	public void moveSnake( int direction )
	{
		if (direction == 0)
			snakeX -= 10;
		if (direction == 1)
			snakeX += 10;
		if (direction == 2)
			snakeY -= 10;
		if (direction == 3)
			snakeY += 10;

		repaint();
	}

	// Changes the snake's direction.
	public void keyPressed( KeyEvent k )
	{
		int key = k.getKeyChar();
		System.out.println(key);
		if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_A)
		{
			// System.out.println("left pressed");
			dir = 0;
			moveSnake(dir);
		}
		if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_D)
		{
			// System.out.println("right pressed");
			dir = 1;
			moveSnake(dir);
		}
		if (key == KeyEvent.VK_UP || key == KeyEvent.VK_W)
		{
			// System.out.println("up pressed");
			dir = 2;
			moveSnake(dir);
		}
		if (key == KeyEvent.VK_DOWN)
		{
			// System.out.println("down pressed");
			dir = 3;
			moveSnake(dir);
		}
		// Exits the applet when the user hits enter.
		// The game over message gives these instructions.
		if (key == KeyEvent.VK_ENTER)
		{
			System.exit(0);
		}
	}

	// Calls the moveSnake method which changes the direction of the
	// snake and keeps it traveling in that same direction unless a new
	// arrow key is pressed; then it will travel in the new direction.
	public void run()
	{
		while (animating)
		{
			try
			{
				Thread.sleep(50);
			} catch (Exception e)
			{
			}

			moveSnake(dir);
			this.addKeyListener(this);
		}
	}

	// Used to prevent flickering.
	public void componentResized( ComponentEvent arg0 )
	{
		m_RenderTarget = createImage(getWidth(), getHeight());
		m_BufferedGraphics = m_RenderTarget.getGraphics();
	}

	// Required by the key and mouse events and the component listener.
	public void keyReleased( KeyEvent arg0 )
	{
	}

	public void keyTyped( KeyEvent arg0 )
	{
	}

	public void mouseEntered( MouseEvent arg0 )
	{
	}

	public void mouseExited( MouseEvent arg0 )
	{
	}

	public void mousePressed( MouseEvent arg0 )
	{
	}

	public void mouseReleased( MouseEvent arg0 )
	{
	}

	public void componentHidden( ComponentEvent arg0 )
	{
	}

	public void componentMoved( ComponentEvent arg0 )
	{
	}

	public void componentShown( ComponentEvent arg0 )
	{
	}
}
