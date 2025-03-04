package ColorChooser;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	JLabel label;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Pick a color");
		button.addActionListener(this);
		
		label = new JLabel("This is some text");
		label.setBackground(Color.white);
		label.setOpaque(true);
		label.setFont(new Font("MV Boli", Font.ITALIC, 100));
		
		this.add(button);
		this.add(label);
		this.pack();
		this.setVisible(true);	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			JColorChooser chooser = new JColorChooser();
			Color color = JColorChooser.showDialog(null, "pick a color", Color.black);
		
			// update label color based on user coose
			
			label.setForeground(color);
		}
	}
}
