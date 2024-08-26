/*
 * Pawn.java
 * File for the Pawn class
 * 8/24/2024 / Can Eryigit
 */

 public class Pawn extends Piece {
    boolean white = false;
    boolean captured = false;
    boolean doubleMove = true;
    String apparence = "p";

    public Pawn(boolean white) {
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

        if(doubleMove) {
            if(start.getY() - end.getY() <= 2) {
                doubleMove = false;
                return true;
            }
        } else {
            if (start.getY() - end.getY() == 1) {
                return true;
            }
        }
        return false;
    }
 }