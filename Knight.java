/*
 * Knight.java
 * File for Knight class
 * 8/24/2024 / Can Eryigit
 */

public class Knight extends Piece {
    private boolean captured = false;
    private boolean white = false;

    public Knight(boolean white) {
        super(white);
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
        return ((start.getY() - end.getY())*(start.getX() - end.getX()) == 2);
    }
}