package MenuBar;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame implements ActionListener{	
	
	JMenuBar menu;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	
	// sample image icon
	ImageIcon icon;

	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		
		icon = new ImageIcon("logo.png");
		
		menu = new JMenuBar();
		
		// menu tabs
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		
		// add menu-items in menubar
		menu.add(fileMenu);
		menu.add(editMenu);
		menu.add(helpMenu);
		
		// add menu items in individual menu
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		// add into file
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		// action listener
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		// add icon to menu
		// loadItem.setIcon(icon);
		
		// shortcuts added
		fileMenu.setMnemonic(KeyEvent.VK_F); // alt + f for file 
		
		loadItem.setMnemonic(KeyEvent.VK_L); // l for load
		saveItem.setMnemonic(KeyEvent.VK_S); // s for save
		exitItem.setMnemonic(KeyEvent.VK_E); // e for exit
		
		this.setJMenuBar(menu);
		this.setLayout(new FlowLayout());
		this.setVisible(true);	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == loadItem) {
			System.out.println("Loaded File Success!! :)");
		} else if (e.getSource() == saveItem) {
			System.out.println("File Saved Success!! :)");
		} else if (e.getSource() == exitItem) {
			System.exit(0); // this will close window
			System.out.println("Exiting !! :)");
		}
	}
}
