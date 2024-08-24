public class Rook extends Piece {
    boolean white = false;
    boolean captured = false;

    public Rook(boolean white) {
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
        return ((start.getY() == end.getY()) || (start.getX() == end.getX()));
    }
}