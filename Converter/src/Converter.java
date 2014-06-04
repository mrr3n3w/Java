import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * @author Jordan 300219995
 */
public class Converter extends JFrame implements ActionListener
{

	JFrame window = new JFrame();
	JPanel converter = new JPanel();
	JPanel centerP = new JPanel();
	JPanel centerP2 = new JPanel();
	JPanel buttonPanel = new JPanel();
	JPanel left = new JPanel();
	JPanel right = new JPanel();
	JPanel inputPanel = new JPanel();
	JPanel buttons = new JPanel();
	
	JLabel title = new JLabel("Distance Converter", JLabel.CENTER);
	JLabel output = new JLabel("Output Goes Here", JLabel.CENTER);
	JLabel textTitle = new JLabel("Distance:");
	JTextField input = new JTextField("");

	JRadioButton MtoF = new JRadioButton("Meters to Feet", true);
	JRadioButton FtoM = new JRadioButton("Feet to Meters");
	ButtonGroup btg = new ButtonGroup();

	JButton convert = new JButton("Convert");

	public void createAndShowGui()
	{
		btg.add(MtoF);
		btg.add(FtoM);
		
		converter.setLayout(new GridLayout(5, 1));
		
		inputPanel.add(textTitle);
		input.setPreferredSize( new Dimension( 200, 24 ) );
		inputPanel.add(input);
		
		centerP.add(inputPanel);
		centerP2.add(output);

		buttonPanel.add(MtoF);
		buttonPanel.add(FtoM);
		buttons.add(buttonPanel);
		
		converter.add(title);
		converter.add(centerP);
		converter.add(centerP2);
		converter.add(buttons);
		converter.add(convert);
		convert.addActionListener(this);
		
		converter.setSize(300, 300);
		converter.setVisible(true);

		window.add(converter);
		window.setSize(300, 300);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void actionPerformed( ActionEvent ae )
	{
		String text = input.getText();
		Double d = new Double(0.00);

		if (ae.getSource() == "convert")
		{
			System.out.println("click");
			if (MtoF.isSelected())
			{
				System.out.println("Meters to feet");
				output.setText(String.valueOf(d * 3.2808));
			} else
				output.setText(String.valueOf(d * 0.3048));
		}
	}

	public static void main( String[] args )
	{
		Converter start = new Converter();
		start.createAndShowGui();
	}
}
