package GridLayoutManager;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new GridLayout(3, 3, 10, 10)); // 3 rows, 3 column, 10px horizontal margin and vertical margin
		this.setVisible(true);
	}
}
