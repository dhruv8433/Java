package BorderLayoutManager;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyFrame() {	
		// setup frame for grid layout
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new BorderLayout(10, 10)); // add margin of 10px each side
		this.setVisible(true);
	}	
}
