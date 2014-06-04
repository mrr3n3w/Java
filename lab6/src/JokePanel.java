import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

/**
 * @author Jordan 300219995
 */
public class JokePanel extends JPanel implements ActionListener
{
	JButton btnPrevious, btnNext, btnRandom, btnPunchline;
	JLabel jokeLine, punchLine;
	private Joke[] jokes;
	String joke = "";
	int i, counter;

	void loadJokes()
	{
		String jokeFile = "C:\\COSC121\\jokes.txt";
		JokeList jl = new JokeList(jokeFile);
		jokes = jl.getJokeArray();
	}

	public JokePanel()
	{
		setLayout(new GridLayout(4, 1, 0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		add(panel);

		JLabel lblTheJoker = new JLabel("The Joker");
		panel.add(lblTheJoker);

		JPanel panel_1 = new JPanel();
		add(panel_1);

		this.jokeLine = new JLabel("");
		jokeLine.setText("Click Next To Start The Joker");
		panel_1.add(jokeLine);

		JPanel panel_2 = new JPanel();
		add(panel_2);

		this.punchLine = new JLabel("");
		punchLine.setText(joke);
		panel_2.add(punchLine);

		JPanel panel_3 = new JPanel();
		add(panel_3);
		panel_3.setLayout(null);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(92, 15, 420, 29);
		panel_3.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 4, 0, 0));

		this.btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(this);
		panel_4.add(btnPrevious);

		this.btnNext = new JButton("Next");
		btnNext.addActionListener(this);
		panel_4.add(btnNext);

		this.btnRandom = new JButton("Random");
		btnRandom.addActionListener(this);
		panel_4.add(btnRandom);

		this.btnPunchline = new JButton("Punchline");
		btnPunchline.addActionListener(this);
		panel_4.add(btnPunchline);
	}

	public void actionPerformed( ActionEvent e )
	{
		if (e.getSource() == btnPrevious)
		{
			System.out.println("Previous");
			if (i <= 9 && i > 1)
			{
				System.out.println(i);
				i = i - 2;
				counter = counter - 2;
				joke = counter + ". " + jokes[i].getSetup();
				jokeLine.setText(joke);
				punchLine.setText("");
				i++;
				counter++;
				System.out.println(i);

			} else
			{
				System.out.println(i);
				i = 0;
				counter = 1;
				joke = "";
				jokeLine.setText(joke);
				punchLine.setText("");
				System.out.println(i);
			}
		}
		if (e.getSource() == btnNext)
		{
			System.out.println("Next");
			if (i == 0)
			{
				i = 0;
			}
			if (counter == 0)
			{
				counter = 1;
			}
			System.out.println(i);
			if (i <= 9)
			{
				joke = counter + ". " + jokes[i].getSetup();
				jokeLine.setText(joke);
				punchLine.setText("");
				i++;
				counter++;
				System.out.println(i);
			} else if (i > 9)
			{
				i = 0;
				counter = 1;
				joke = counter + ". " + jokes[i].getSetup();
				jokeLine.setText(joke);
				punchLine.setText("");
				i++;
				counter++;
				System.out.println(i);
			}

		}
		if (e.getSource() == btnRandom)
		{
			i = (int) (Math.random() * 10);
			counter = i + 1;
			System.out.println(i);
			joke = counter + ". " + jokes[i].getSetup();
			jokeLine.setText(joke);
			punchLine.setText("");
		}
		if (e.getSource() == btnPunchline)
		{

			if (i >= 1 && i != 10)
			{
				System.out.println(i);
				i--;
				joke = jokes[i].getPunchline();
				punchLine.setText(joke);
				i++;
			} else if (i == 10)
			{
				System.out.println(i);
				i = 9;
				joke = jokes[i].getPunchline();
				punchLine.setText(joke);
				i++;
			}
		}
	}
}
