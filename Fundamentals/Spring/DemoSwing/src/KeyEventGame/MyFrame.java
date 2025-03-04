package KeyEventGame;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements KeyListener{
	
	JLabel label;
	ImageIcon icon;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(null);
		
		label = new JLabel();
		label.setBounds(0, 0, 100, 100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		
		// icon = new ImageIcon("Rocker.jpg");
		// label.setIcon(icon);
		
		this.add(label);
		// add key listener
		this.addKeyListener(this);
		this.getContentPane().setBackground(Color.black);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// When key is typed
		switch (e.getKeyChar()) {
		case 'a': {
			label.setLocation(label.getX() - 10, label.getY());
			break;
		}
		case 'w': {
			label.setLocation(label.getX(), label.getY() - 10);
			break;
		}
		case 's': {
			label.setLocation(label.getX(), label.getY() + 10);
			break;
		}
		case 'd': {
			label.setLocation(label.getX() + 10, label.getY());
			break;
		}
		default: {
			System.out.println("Wrong Key");
			}
		}	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case 37: {
			label.setLocation(label.getX() - 10, label.getY());
			break;
		}
		case 38: {
			label.setLocation(label.getX(), label.getY() - 10);
			break;
		}
		case 39: {
			label.setLocation(label.getX() + 10, label.getY());
			break;
		}
		case 40: {
			label.setLocation(label.getX(), label.getY() + 10);
			break;
		}
		default: {
			System.out.println("Wrong Key");
			}
		}	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// When key is released
		System.out.println("You released key char: "+ e.getKeyChar());		
		System.out.println("You released key code: "+ e.getKeyCode());		
	}

	
}
