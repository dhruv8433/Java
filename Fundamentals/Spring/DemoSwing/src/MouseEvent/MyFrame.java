package MouseEvent;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener{
	
	JLabel label;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		
		label = new JLabel();
		label.setBounds(0, 0, 100, 100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		
		// add mouse events on label
		label.addMouseListener(this);
		
		this.add(label);
		this.setLayout(null);
		this.setVisible(true);	
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// mouse clicked
		System.out.println("You clicked on label");
		label.setBackground(Color.yellow);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// mouse button pressed or hold
		System.out.println("Mouse Pressed");
		label.setBackground(Color.GREEN);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// mouse button released
		System.out.println("Mouse Released");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// mouse enter in component
		System.out.println("Mouse Enter in component");
		label.setBackground(Color.blue);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//	mouse exit outside component
		System.out.println("Mouse Exit in component");
		label.setBackground(Color.red);
		
	}

}
