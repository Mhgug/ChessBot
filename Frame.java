/*
 * Frame.java
 * file for the frame
 * 9/21//2024 / Can Eryigit
 */

import javax.swing.*;
import java.awt.event.*;

class Frame extends JFrame{

    Panel panel;

    Frame() {
        panel = new Panel();

        panel.addMouseListener(new MouseAdapter() { 
            public void mousePressed(MouseEvent e) {
            }
        });

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
}