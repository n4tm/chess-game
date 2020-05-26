package javachessgame.chess;

import javachessgame.boardgame.Board;
import javachessgame.boardgame.Piece;

public class ChessPiece extends Piece{
    private Color color;
    
    public ChessPiece(Board board, Color color){
        super(board);
        this.color = color;
    }
    public Color getColor() {
        return color;
    }
}