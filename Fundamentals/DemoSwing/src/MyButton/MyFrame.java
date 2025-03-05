package MyButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame
//implements ActionListener
{
	// global button
	JButton button;

	// constructor
	MyFrame() {
		ImageIcon icon = new ImageIcon("logo.png");

		// buttons
		button = new JButton();
		button.setBounds(200, 100, 250, 100);
		// button.addActionListener(this); // action listner added
		button.addActionListener(e -> System.out.println("Clicked")); // lambda expression
		button.setText("Click Me!!");
		button.setFocusable(false);
		button.setIcon(icon); // set icon to button
		button.setFont(new Font("Comic Sans", Font.BOLD, 25));
		button.setBackground(Color.BLUE);
		//button.setBorder(BorderFactory.createDashedBorder());

		this.setTitle("My JFrame"); // set title
		this.setSize(750, 750); // set size
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		this.setResizable(false); // prevent this from being resized
		this.setVisible(true); // make this visible

		ImageIcon image = new ImageIcon("logo.png"); // create an image icon

		this.setIconImage(image.getImage()); // change this icon
		this.add(button); // add button
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		if(e.getSource() == button) {
//			System.out.println("Clicked");
//		}
//	}
}
