/**
 * @author Jordan
 * 300219995
 */
import java.util.Scanner;

public class GameMain 
{
	static Scanner input = new Scanner(System.in);
	public static void main (String []args)
	{
		Function.Turn(1);
		Function.setPos(input.nextInt());
		Function.printPosO();
		Function.Turn(2);
		Function.setPos(input.nextInt());
		Function.Board();
	}
}
