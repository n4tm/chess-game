package javachessgame.application;

import java.util.Scanner;

import javachessgame.chess.ChessMatch;
import javachessgame.chess.ChessPiece;
import javachessgame.chess.ChessPosition;

public class Program {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(sc);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }
        
    }
}