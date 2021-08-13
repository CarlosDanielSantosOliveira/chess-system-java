package application;

import boardGame.Board;
import boardGame.Position;
import chess.ChessMatch;

public class Program {

    public static void main (String [] args) throws Exception {

        ChessMatch chessMatch = new ChessMatch();

        UI.printBoard(chessMatch.getPieces());

    }
}
