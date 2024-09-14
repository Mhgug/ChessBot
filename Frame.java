/*
 * Frame.java
 * file for the frame
 * 9/14//2024 / Can Eryigit 
 */

import javax.swing.*;

class Frame extends JFrame{

    Panel panel;

    Frame() {
        
        panel = new Panel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
}