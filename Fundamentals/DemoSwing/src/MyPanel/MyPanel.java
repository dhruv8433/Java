package MyPanel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
		
	public static void main(String[] args) {
			
		JLabel label = new JLabel();
		label.setText("Hello World!");
		
		JFrame frame = new JFrame();
		// JPanel = a gui component that functions as a container to hold other components
		frame.setTitle("My JFrame"); // set title
		frame.setSize(700, 700); // set size
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of applicatio

		JPanel redpanel = new JPanel();
		redpanel.setBackground(Color.red);
		redpanel.setBounds(0, 0, 250, 250); // top, left 250 square
		
		JPanel bluepanel = new JPanel();
		bluepanel.setBackground(Color.BLUE);
		bluepanel.setBounds(250, 0, 250, 250); // when red completed blue started
		
		JPanel greenpanel = new JPanel();
		greenpanel.setBackground(Color.GREEN);
		greenpanel.setBounds(0, 250, 500, 250); // grid kind space occupi 2 box
//		greenpanel.setLayout(new BorderLayout());
		frame.setLayout(null);
		frame.add(greenpanel);
		frame.add(bluepanel);
		frame.add(redpanel);
		redpanel.add(label); // add icon to panel
		
		frame.setVisible(true); // make this visible
	}
}
