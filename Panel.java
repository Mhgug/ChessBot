/*
 * Panel.java
 * Display of the game
 * 9/14/2024 / Can Eryigit
 */

import java.awt.*;
import javax.swing.*;

class Panel extends JPanel {
    Board board = new Board();

    Panel() {
        this.setPreferredSize(new Dimension(400, 400));
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int x = 0;
        int y = 0;
    
        g2d.setColor(Color.BLACK);
        for(int i = 0; i < 8; i++) {

            y = 100 * i;

            for(int j = 0; j < 8; j++) {
                g2d.fillRect(x, y, 50, 50);
                g2d.fillRect(x+50, y+50, 50, 50);
                x = 100 * j;
            }
        }
        g2d.setColor(Color.GRAY);
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if(board.boxes[i][j] != null && board.boxes[i][j].getPiece() != null) {
                    g2d.drawString(board.boxes[i][j].getPiece().isApparence(), (j*50)+25, (i*50)+25);
                }
            }
        }
    }
}