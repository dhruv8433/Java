package FlowLayoutManager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
		// Layout Manager = Define the natural layout for components within a container
		
		// Flow Layout = place component in row, sized at their preferred size. If the horizontal 
		//               space is the container is too small, the flow layout use next row.
		
		// JPanel panel = new JPanel();
		// panel.setPreferredSize(new Dimension(100, 250));
		// panel.setBackground(Color.LIGHT_GRAY);
		// panel.setLayout(new FlowLayout());
		
		JFrame frame = new MyFrame();
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		// panel.add(new JButton("9"));	
		
		// frame.add(panel);
		frame.add(frame);
	}
}
