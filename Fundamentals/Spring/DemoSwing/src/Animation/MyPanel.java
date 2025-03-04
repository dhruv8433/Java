package Animation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener{ 
	
	final int PANEL_WIDTH = 500;
	final int PANEL_HEIGHT = 500;
	Image earth;
	Timer timer;
	int xVelocity = 2;
	int yVelocity = 1;
	int x = 0;
	int y = 0;
	
	
	MyPanel(){
		this.setPreferredSize(new Dimension(PANEL_HEIGHT, PANEL_WIDTH));
		this.setBackground(Color.black);
		earth = new ImageIcon("logo.png").getImage();
		
		timer = new Timer(10, this); // update on every 10 mili-second
		timer.start();
		
	}

	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(earth, x, y, null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(x >= PANEL_WIDTH - earth.getWidth(null) || x < 0) {
			xVelocity = xVelocity * -1;
		}
		
		x = x + xVelocity;
		
		// same we can do with height and if we put both xVelocity and yVelocity than it perform in daignal
		if(y >= PANEL_HEIGHT - earth.getHeight(null) || y < 0) {
			yVelocity = yVelocity * -1;
		}
		
		y = y + yVelocity;
		
		
		
		repaint();
	}
}
