package com.x40arcade;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.*;

public class BackgroundPanel extends JPanel {
    private static final long serialVersionUID = 1L;

    // Variables
    private Image background;
    private Image middleground;
    private Image foreground;

    private Image Room207;

    public BackgroundPanel() {
        // Load images from the correct path
        background = new ImageIcon(getClass().getResource("/assets/MainMenu/o-1.png")).getImage();
        middleground = new ImageIcon(getClass().getResource("/assets/MainMenu/o-2.png")).getImage();
        foreground = new ImageIcon(getClass().getResource("/assets/MainMenu/o-3.png")).getImage();
        Room207 = new ImageIcon(getClass().getResource("/assets/MainMenu/o-4.png")).getImage();
    }

    // This must be called in the constructor


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
        g.drawImage(middleground, 0, 0, getWidth(), getHeight(), this);
        g.drawImage(foreground, 0, 0, getWidth(), getHeight(), this);
        g.drawImage(Room207, 380, 40, 582, 136, this);
    }


}
