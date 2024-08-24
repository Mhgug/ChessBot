/*
 * Spot.java
 * File for spot class
 * 8/23/2024 / Can Eryigit
 */

 public class Spot {
    private Piece piece; 
    private int x; 
    private int y; 
  
    public Spot(int x, int y, Piece piece) 
    { 
        this.setPiece(piece); 
        this.setX(x); 
        this.setY(y); 
    } 
  
    public Piece getPiece() 
    { 
        return this.piece; 
    } 
  
    public void setPiece(Piece p) 
    { 
        this.piece = p; 
    } 
  
    public int getX() 
    { 
        return this.x; 
    } 
  
    public void setX(int x) 
    { 
        this.x = x; 
    } 
  
    public int getY() 
    { 
        return this.y; 
    } 
  
    public void setY(int y) 
    { 
        this.y = y; 
    }
 }