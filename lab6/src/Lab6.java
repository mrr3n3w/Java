
import javax.swing.JFrame;

public class Lab6
{
	public static void main( String[] args )
	{
		
		JFrame app = new JFrame();
		JokeP rp = new JokeP();
		rp.loadJokes();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(rp);
		app.setSize(600, 200);
		app.setVisible(true);
	}
}