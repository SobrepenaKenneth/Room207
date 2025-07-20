package com.x40arcade;

import javax.swing.*;
import java.awt.*;

public class BackgroundPanel extends JPanel {

	/**
	 * 
	 */
	// IGNORE THIS
	private static final long serialVersionUID = 1L;

	// Variables
	private Image background;
	private Image middleground;
	private Image foreground;
	
	private Image Room207;

	// This is a constructor
    public BackgroundPanel() {
    	// Objects
    	background = new ImageIcon(getClass().getResource("/assets/MainMenu/o-1.png")).getImage();
    	middleground = new ImageIcon(getClass().getResource("/assets/MainMenu/o-2.png")).getImage();
    	foreground = new ImageIcon(getClass().getResource("/assets/MainMenu/o-3.png")).getImage();
    	Room207 = new ImageIcon(getClass().getResource("/assets/MainMenu/o-4.png")).getImage();
    }

    @Override
    // this method is what draws the object in screen
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
        g.drawImage(middleground, 0, 0, getWidth(), getHeight(), this);
        g.drawImage(foreground, 0, 0, getWidth(), getHeight(), this);
        g.drawImage(Room207, 0, 0, getWidth(), getHeight(), this);
    }
}