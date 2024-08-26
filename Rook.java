/*
 * Rook.java
 * File for the rook class
 * 8/24/2024 / Can Eryigit
 */

public class Rook extends Piece {
    boolean white = false;
    boolean captured = false;
    String apparence = "r";

    public Rook(boolean white) {
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
        
        return ((start.getY() == end.getY()) || (start.getX() == end.getX()));
    }
}