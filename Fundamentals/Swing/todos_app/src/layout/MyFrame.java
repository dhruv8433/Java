package layout;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame(){
		this.setSize(700, 700);
//		this.setLayout(new BoxLayout(rootPane, MAXIMIZED_BOTH));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
