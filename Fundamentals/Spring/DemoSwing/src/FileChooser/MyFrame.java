package FileChooser;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		
		button = new JButton("Select a File");
		button.addActionListener(this);
		
		this.add(button);
		this.pack();
		this.setLayout(null);
		this.setVisible(true);	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			
			JFileChooser fileChoose = new JFileChooser();
			
			fileChoose.setCurrentDirectory(new File(".")); // save file to current directory
			
			// return 0 if file choose, if cancle than 1
			//int response = fileChoose.showOpenDialog(null);  // select file to open
			int response = fileChoose.showSaveDialog(null);  // select file to save
			
			
			if(response == JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChoose.getSelectedFile().getAbsolutePath());
				// print location of that file
				System.out.println(file);
			}
		}
	}
}
