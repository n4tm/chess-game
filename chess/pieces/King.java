package javachessgame.chess.pieces;

import javachessgame.boardgame.Board;
import javachessgame.chess.ChessPiece;
import javachessgame.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "K";
    }
}