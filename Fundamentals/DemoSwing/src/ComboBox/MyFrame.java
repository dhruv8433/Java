package ComboBox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
	
	JComboBox<String> comboBox; // comboBox with wrapper class of string
	String[] animals = {"dog", "cat", "bird"}; // array of animals
	
	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		comboBox = new JComboBox<String>(animals); // add animals array in comboBox
		
		comboBox.addActionListener(this); // action listener for comboBox
		comboBox.setEditable(true); // we can modify option value
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == comboBox) {
			System.out.println(comboBox.getSelectedItem());
		}
	}
}
