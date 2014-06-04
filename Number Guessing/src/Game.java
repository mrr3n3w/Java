	/**
	 * @author Jordan
	 * 300219995
	 */

import java.util.Random;

import javax.swing.*; 

import java.util.Scanner;

import javax.swing.JOptionPane;

	
			
public class Game
{
	
	@SuppressWarnings({ "resource" })
	
	public static void main (String [] args) {
	{
		JPanel totalGUI = new JPanel();
		totalGUI.setLayout(null);
		
		Scanner input = new Scanner(System.in);
		Random number = new Random();
		int number1 = 0;
		number1 = 1+ number.nextInt(100);
		int guesses = 0;
		System.out.print(number1);
		JOptionPane.showInputDialog("Enter A Guess");
		int entered = input.nextInt();

		
		while (entered != number1)
		{
			if(entered <= number1)
			{
				JOptionPane.showInputDialog("To low try again:");
				entered = input.nextInt();
			}
			if(entered >= number1)
			{
				JOptionPane.showInputDialog("To high try again:");
				entered = input.nextInt();
			}
			guesses++;
		}
		
			JOptionPane.showConfirmDialog(null, "Congratulations, you did it! It took you %d tries", 
					null, guesses);
		

		}

	}
}

