package GridLayoutManager;

import java.awt.GridLayout;

import javax.swing.JButton;

public class Main {
	public static void main(String[] args) {
		// Grid Layout: place components in grid cells.
					 // Each components take all the available space within its cell, 
					//  and each cell is the same size
		
		MyFrame frame = new MyFrame();
		
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));

		frame.setVisible(true);
	}	
}
