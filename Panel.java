/*
 * Panel.java
 * Display of the game
 * 8/31/2024 / Can Eryigit
 */

import java.awt.*;
import javax.swing.*;

class Panel extends JPanel {
    Board board = new Board();

    Panel(){
        this.setPreferredSize(new Dimension(400, 400));
    }

    public void boardRepresent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        int x = 0;
        int y = 0;

        g2d.setPaint(new Color(0, 0, 0));
        for(int i = 0; i < 8; i++) {

            for(int j = 0; j < 8; j++) {
                g2d.fillRect(x, y, 50, 50);
                x = 100 * j;
            }
    
            y = 100 * i;

        }

        x = 50;
        y = 0;

        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                g2d.fillRect(x, y, 50, 50);
                x = 100 * j + 50;
            }

            y = 100 * i + 50;

        }
    }
}