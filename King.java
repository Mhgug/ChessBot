/*
 * King.java
 * File for the king
 * 8/24/2024 / Can Eryigit
 */

public class King extends Piece {
    private boolean castlingDone = false; 
  
    public King(boolean white) { 
        super(white); 
    } 
  
    public boolean isCastlingDone() { 
        return this.castlingDone; 
    } 
  
    public void setCastlingDone(boolean castlingDone) { 
        this.castlingDone = castlingDone; 
    } 
  
    public boolean canMove(Board board, Spot start, Spot end) {
        if (end.getPiece().isWhite() == this.isWhite()) { 
            return false; 
        }
  
        int x = Math.abs(start.getX() - end.getX()); 
        int y = Math.abs(start.getY() - end.getY()); 
        if (x + y == 1) { 
            return true; 
        }
        return isValidCastling(board, start, end);
    } 
  
    private boolean isValidCastling(Board board, Spot start, Spot end) { 
        return !(this.isCastlingDone());
    } 
  
    /*
     * Castling not possiable 
     * if the king has moved before
     * if there is a piece blocking it's way
     * if the rook has moved before
     * if the king is going through a check
     */

    public boolean isCastlingMove(Board boxes) {
        return ((this.isWhite() && ((boxes.boxes[0][1] == null && boxes.boxes[0][2] == null) || (boxes.boxes[0][4] == null && boxes.boxes[0][5] == null && boxes.boxes[0][6] == null) )) ||
        (this.isWhite() == false && ((boxes.boxes[7][1] == null && boxes.boxes[7][2] == null) || (boxes.boxes[7][4] == null && boxes.boxes[7][5] == null && boxes.boxes[7][6] == null) )));
    }
}