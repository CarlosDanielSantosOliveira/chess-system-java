package chess;

import boardGame.Board;

public class ChessMatch { //Tabuleiro de xadrez

    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i=0; i<board.getRows(); i++){
            for (int j=0; j<board.getColumns(); j ++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    } //Vai me retornar uma matriz de peças de xadrez correspondentes a essa partida.


}
