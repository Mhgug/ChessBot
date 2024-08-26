/*
 * Bishop.java
 * File for the Bishop class
 * 8/24/2024 / Can Eryigit
 */

 public class Bishop extends Piece {
    boolean white = false;
    boolean captured = false;
    String apparence = "b";

    public Bishop(boolean white) {
        super(white);
    }

    public String isApparence() {
        return this.apparence;
    }

    public void setApparence(String apparence) {
        this.apparence = apparence;
    }

    public boolean isWhite() {
        return this.white;
    }

    public void setWhite(boolean white) {
        this.white = white;
    } 

    public boolean isCaptured() {
        return this.captured;
    }

    public void setCaputered(boolean captured) {
        this.captured = captured;
    }

    public boolean canMove(Board board, Spot start, Spot end) {
        if (end.getPiece().isWhite() == this.isWhite()) { 
            return false; 
        }
        return ((start.getX()/end.getX() == 1) && (start.getY()/end.getY() == 1));
    }
 }