package KeyBinding;

import java.awt.Color;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class Game {
	JFrame frame;
	JLabel label;
	
	UpAction upAction;
	DownAction downAction;
	LeftAction leftAction;
	RightAction rightAction;
	
	Game() {
			
		frame = new JFrame("Keybinding demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 402);
		frame.setLayout(null);
		
		label = new JLabel();
		label.setBackground(Color.red);
		label.setBounds(100, 100, 100, 100);
		label.setOpaque(true);
		
		upAction = new UpAction();
		downAction = new DownAction();
		leftAction = new LeftAction();
		rightAction = new RightAction();
		
		label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
		label.getActionMap().put("upAction", upAction);
		label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
		label.getActionMap().put("downAction", downAction);
		label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
		label.getActionMap().put("leftAction", leftAction);
		label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
		label.getActionMap().put("rightAction", rightAction);
		
		frame.add(label);
		frame.setVisible(true);
	}
	
	public class UpAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX(), label.getY() - 10); // set label up
		}
		
	}
	public class DownAction extends AbstractAction{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX(), label.getY() + 10); // set label up
		}
		
	}
	public class LeftAction extends AbstractAction{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX() - 10, label.getY()); // set label up
		}
		
	}
	public class RightAction extends AbstractAction{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX() + 10, label.getY()); // set label up
		}
		
	}
 }
