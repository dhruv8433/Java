package TextFeild;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements  ActionListener {

	JTextField textfeild;
	JButton button;
	
	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		textfeild = new JTextField();
		textfeild.setPreferredSize(new Dimension(250, 40));
		textfeild.setFont(new Font("Consolas", Font.PLAIN, 35));
		textfeild.setForeground(Color.GREEN);
		textfeild.setBackground(Color.black);
		textfeild.setCaretColor(Color.white);
		textfeild.setText("UserName");
		// textfeild.setEditable(false);
		
		button = new JButton("Submit");
		
		this.add(button);
		this.add(textfeild);
		this.pack();
		this.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			button.setEnabled(false);
			textfeild.setEditable(false);
			System.out.println("WElcome " + textfeild.getText()); 
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
