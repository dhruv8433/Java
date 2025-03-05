package JSliders;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;

public class MyFrame extends JFrame implements ActionListener {
	
	JSlider slider;
	JLabel label;
	JPanel panel;
	
	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0, 100, 50);  // min, max and start point
		
		// add slider and label into panel
		panel.add(slider);
		panel.add(label);
		
		// add size of slider
		slider.setPreferredSize(new Dimension(400, 200));
		slider.setPaintTicks(true); // add ticks
		slider.setMinorTickSpacing(10); // add ticks spacing
		// slider.setPaintTrack(true);
		// slider.setMajorTickSpacing(25);
		
		slider.setPaintLabels(true); // display points
		slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
		
		slider.setOrientation(SwingConstants.VERTICAL); // update orientation to vertical
		//slider.addChangeListener(this);
		
		label.setText("C = "+slider.getValue());
		
		this.add(panel);
		this.add(label);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void stateChanged(ChangeEvent e) {
		label.setText("C = "+slider.getValue());
	}
	

	
}
