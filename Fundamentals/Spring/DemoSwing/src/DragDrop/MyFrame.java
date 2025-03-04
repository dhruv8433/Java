package DragDrop;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

	
	DragPanel dragPanel = new DragPanel();
	
	MyFrame(){
		// add panel in frame
		this.add(dragPanel);
		this.setTitle("Drag & Drop");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(null);
		this.setVisible(true);	
	}

}
