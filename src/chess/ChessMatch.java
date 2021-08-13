package chess;

import boardGame.Board;
import boardGame.Position;
import chess.pieces.King;
import chess.pieces.Rook;
import com.sun.media.sound.RIFFInvalidDataException;

public class ChessMatch { //Tabuleiro de xadrez

    private Board board;

    public ChessMatch() throws Exception {
        board = new Board(8, 8);
        initialSetup(); //Adicionei este método ao construtor, para que o jogo ja comece com as peças no tabuleiro
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

    private void placeNewPiece(char column, int row, ChessPiece piece) throws Exception {
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    private void initialSetup() throws Exception { //Vai iniciar a partida colocando as peças no tabuleiro
        placeNewPiece('b', 6, new Rook(board, Color.WHITE));
        placeNewPiece('c', 7, new King(board, Color.WHITE));
        placeNewPiece('d', 8, new Rook(board, Color.WHITE));

    }

}
