package RadioButton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener{
	
	JRadioButton pizzaButton;
	JRadioButton burgerButton;
	JRadioButton donutButton;
	
	ButtonGroup group;
	
	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		// create radio button
		pizzaButton = new JRadioButton("pizza");
		burgerButton = new JRadioButton("burger");
		donutButton = new JRadioButton("donut");
		
		// create button group
		group = new ButtonGroup();
		
		// add items to button group
		group.add(pizzaButton);
		group.add(burgerButton);
		group.add(donutButton);
		
		// add action listener to radio buttons
		pizzaButton.addActionListener(this);
		donutButton.addActionListener(this);
		burgerButton.addActionListener(this);
		
		// add radio button in frame
		this.add(pizzaButton);
		this.add(burgerButton);
		this.add(donutButton);
		
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == pizzaButton) {
			System.out.println("You ordered pizza");
		} else if (e.getSource() == burgerButton) {
			System.out.println("You ordered burger");
		} else {
			System.out.println("You ordered donut");
		}
	}
}
