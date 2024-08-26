/*
 * Panel.java
 * Display of the game
 * 8/25/2024 / Can Eryigit
 */

import java.awt.*;
import javax.swing.*;

class Panel extends JPanel {
    Spot[][] boxes;

    Panel(){
        this.setPreferredSize(new Dimension(400, 400));
        this.resetBoard();
    }
  
    public Spot getBox(int x, int y) throws Exception { 
  
        if (x < 0 || x > 7 || y < 0 || y > 7) { 
            throw new Exception("Index out of bound"); 
        } 
  
        return boxes[x][y]; 
    } 
    public void resetBoard() {
        boxes[0][0] = new Spot(0, 0, new Rook(true));
        boxes[0][1] = new Spot(0, 1, new Knight(true));
        boxes[0][2] = new Spot(0, 2, new Bishop(true));
        boxes[1][0] = new Spot(1, 0, new Pawn(true));
        boxes[1][1] = new Spot(1, 1, new Pawn(true));

        boxes[7][0] = new Spot(7, 0, new Rook(false));
        boxes[7][1] = new Spot(7, 1, new Knight(false));
        boxes[7][2] = new Spot(7, 2, new Bishop(false));
        boxes[6][0] = new Spot(6, 0, new Pawn(false)); 
        boxes[6][1] = new Spot(6, 1, new Pawn(false));

        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                boxes[i][j] = new Spot(i, j, null);
            }
        }
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
                if (boxes[i][j] != null) {
                    System.out.println("");
                }
            }
    
            y = 100 * i;

        }

        x = 50;
        y = 0;

        for(int i = 0; i < 8; i++) {

            y = 100 * i + 50;
            
            for(int j = 0; j < 8; j++) {
                g2d.fillRect(x, y, 50, 50);
                x = 100 * j + 50;
            }
        }
    }
}