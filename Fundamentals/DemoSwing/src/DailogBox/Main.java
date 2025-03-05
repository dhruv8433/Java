package DailogBox;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		// JOptionPane = popup a standard dailog box that prompts users for a value or info them to something.
		
		JOptionPane.showMessageDialog(null, "This is message", "MyDailog", JOptionPane.PLAIN_MESSAGE); // plain 
		JOptionPane.showMessageDialog(null, "This is informaiton", "MyDailog", JOptionPane.INFORMATION_MESSAGE); // info
		JOptionPane.showMessageDialog(null, "Really ?", "MyDailog", JOptionPane.QUESTION_MESSAGE);  // question
		JOptionPane.showMessageDialog(null, "Your computer has a virus!", "MyDailog", JOptionPane.WARNING_MESSAGE);  // warning
		JOptionPane.showMessageDialog(null, "Something went wrong!!", "MyDailog", JOptionPane.ERROR_MESSAGE);  // error
		
		// confirm dailog box
		int answer = JOptionPane.showConfirmDialog(null, "bro do you even code?", "MyTitle", JOptionPane.YES_NO_CANCEL_OPTION);
		// yes = 0, no = 1, cancle = 2 and close = -1
		String name = JOptionPane.showInputDialog("What is your name");
		System.out.println("Hello "+name);
		
		//JOptionPane.showOptionDialog(null, "You are Awesome", "secret messagee", JOptionPane.YES_NO_CANCEL_OPTION, null, null, 0);
	
	}
}
