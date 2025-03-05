package Graphics2D;


import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyPanel panel;
	
	MyFrame(){
		
		panel = new MyPanel();
		
		this.add(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setLayout(null);
		this.setVisible(true);		
	}
	
}
