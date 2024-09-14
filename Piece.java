/*
 * Piece.java
 * File for Piece class
 * 9/14/2023 / Can Eryigit
 */

public abstract class Piece {
    private boolean captured = false;
    private boolean white = false;
    public String apparance = "p";

    public Piece(boolean white) {
        this.white = white;
    }

    public String isApparence() {
        return this.apparance;
    }

    public void setApparence(String apparance) {
        this.apparance = apparance;
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

    public abstract boolean canMove(Board board, Spot start, Spot end);
}