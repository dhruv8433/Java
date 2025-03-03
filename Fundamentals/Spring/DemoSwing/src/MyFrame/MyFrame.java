package MyFrame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MyFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame(); // create frame
		JLabel label = new JLabel();
		
		frame.setTitle("My JFrame"); // set title
		frame.setSize(420, 420); // set size
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		
//		frame.setResizable(false);  // prevent frame from being resized
//		
		
//		
		ImageIcon image = new ImageIcon("logo.png"); // create an image icon
		Border border = BorderFactory.createLineBorder(Color.blue, 3);
		
		frame.setIconImage(image.getImage()); // change frame icon
//		frame.getContentPane().setBackground(new Color(123, 50, 250)); // change bg color
//		//frame.getContentPane().setBackground(new Color(0xFF22FF)); // change bg color by hex code
//			
		
//		new MySecondFrame();
		
//		JLable
		label.setText("Hello World!");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);  // set text LEFT, CENTER, RIGHT
		label.setVerticalTextPosition(JLabel.TOP);
		
		label.setForeground(Color.BLUE); // change color
		label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // set font
		
		label.setIconTextGap(20); // set gap to image
		label.setBackground(Color.black); // set background
		
		// or
		
		label.setOpaque(true); // display bg color
		label.setBorder(border); // create border around label
		
		label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon and text
		label.setHorizontalAlignment(JLabel.CENTER); // set Horizontal position of icon and text
		
		// frame.setLayout(null);
		// label.setBounds(100 , 100, 250, 250); // x, y, height and weight of label		
		
		
		frame.add(label); // add label to frame
		frame.pack();  // auto size
		
		
		frame.setVisible(true);  // make frame visible
	}
}
