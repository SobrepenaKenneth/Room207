package com.x40arcade;

//IMPORTS FROM PACKAGES
import javax.swing.*; // for JFrame, JPanel, JButton, etc.

public class MainMenu extends JPanel{
	/**
	 * 
	 */
	//IGNORE THIS
	private static final long serialVersionUID = 1L;

	//This is a constructor it has the same name as the class
	public MainMenu() {
		JFrame frame = new JFrame("Room 207 - Game Screen");
		
		//In this part im calling the Methods inside JFrame
		frame.setSize(1280, 720); //set nung size
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Close the app
		frame.setLocationRelativeTo(null); // close the window on screen
		frame.setContentPane(new BackgroundPanel()); // using this method it will display the BackgroudPanel
		frame.setVisible(true); // show the window
	}
	
	// think of this one that runs everything
	public static void main(String[] args) {
		new MainMenu();
	}

}
