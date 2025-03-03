package Checkbox;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	
	JCheckBox checkbox;
	JButton button;
	
	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		checkbox = new JCheckBox(); 
		checkbox.setText("I am Not a ROBOT!");
		checkbox.setFocusable(false);
		
		button = new JButton("submit");
		button.addActionListener(this);
		
		this.add(button);
		this.add(checkbox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println(checkbox.isSelected());
		}
	}
}
