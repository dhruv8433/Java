package FlowLayoutManager;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame() {
		// TODO Auto-generated constructor stub
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		//this.setLayout(new FlowLayout(FlowLayout.LEADING)); // Lead means from starting
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // by default it is in center and we can also add spacing
		this.setVisible(true);
	}
}
