package DragDrop;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class DragPanel extends JPanel {
	
	ImageIcon image = new ImageIcon("logo.png");
	final int WIDTH = ((Icon) image).getIconWidth(); // image width
	final int HEIGHT = ((Icon) image).getIconHeight(); // image height
	Point imageCorner;
	Point prevPt;
	
	
	DragPanel() {
		System.out.println("Loadded "+ image);
		imageCorner = new Point(0, 0); // top corner of image
		ClickListner clickListener = new ClickListner();
		DragListener dragListener = new DragListener();
		
		this.addMouseListener(clickListener);
		this.addMouseMotionListener(dragListener);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		image.paintIcon(this, g, (int) imageCorner.getX(), (int) imageCorner.getY());
	}
	
	private class ClickListner extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			prevPt = e.getPoint(); // update location where we click 
		} 
	}
	
	private class DragListener extends MouseMotionAdapter {
		
		public void MouseDragged(MouseEvent e) {
			Point currentPt = e.getPoint();
			imageCorner.translate(
					(int) (currentPt.getX() - prevPt.getX()),
					(int) (currentPt.getY() - prevPt.getY())
					); // translate to new position
			prevPt = currentPt;
			repaint();
		}
		
	}
}
