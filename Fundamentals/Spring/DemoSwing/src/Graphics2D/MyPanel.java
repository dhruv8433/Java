package Graphics2D;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
	
	Image image;
	
	MyPanel() {
		this.setPreferredSize(new Dimension(500, 500));
		image = new ImageIcon("logo.png").getImage();
	}
	
	public void paint(Graphics g) {
		// cast to 2d object
		Graphics2D g2d = (Graphics2D) g;
		
		//custom image
		g2d.drawImage(image, 0, 0, null);
		
		g2d.setStroke(new BasicStroke(5)); // 5px bold 
		g2d.setPaint(Color.BLUE);
		g2d.drawLine(0, 0, 500, 500); // draw line
		
		// g2d.drawRect(0, 0, 100, 200); // rectangle
		//g2d.fillRect(0, 0, 100, 200); // filled rectangle
		g2d.setPaint(Color.pink); // change color
		//g2d.fillOval(0,  0, 100, 100); // filled Circle
		
		// g2d.drawArc(0, 0, 100, 100, 180, 180); // half circle last 2 are degree where to start and where to go
		g2d.fillArc(0, 0, 100, 100, 0, 180);
		
		// polygon
		//int[] xPoints = {150, 250, 350};
		//int[] yPoints = {300, 150, 300};
		
		//g2d.fillPolygon(xPoints, yPoints, 2);
		
		//g2d.setFont(new Font("MV Boli", Font.BOLD, 25));
		//g2d.setFont(new Font("Ink Free", Font.BOLD, 25));
		//g2d.drawString("U R A Winner", 50, 50);
		
		
		
		
		
		
		
		
	}
}
