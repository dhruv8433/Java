package ProgressBar;
import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
	
	JProgressBar bar = new JProgressBar(0, 500);
	
	MyFrame() {
		
		bar.setValue(0); // initial value of progress bar
		bar.setBounds(0, 0, 420, 50);
		bar.setStringPainted(true); // display percentage on progress bar
		bar.setFont(new Font("MV Boli", Font.BOLD, 25));
		bar.setForeground(Color.red);
		bar.setBackground(Color.black);
		
		// add bar to frame
		this.add(bar);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420, 420);
		this.setLayout(null);
		this.setVisible(true);
		
		fill();
		
	}

	public void fill() {
		int counter = 100;
		
		while(counter > 0) {			
			bar.setValue(counter);
			try {
				Thread.sleep(50); // sleep thread for .05 sec after each iteration
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			counter -= 1;
		} 
		bar.setString("Completed :)");
	}
}

