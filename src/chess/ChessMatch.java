package chess;

import boardGame.Board;
import boardGame.Position;
import chess.pieces.King;
import chess.pieces.Rook;
import com.sun.media.sound.RIFFInvalidDataException;

public class ChessMatch { //Tabuleiro de xadrez

    private Board board;

    public ChessMatch() {
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

    private void initialSetup() { //Vai iniciar a partida colocando as peças no tabuleiro
        board.placePiece(new Rook(board, Color.WHITE), new Position(5, 3));
        board.placePiece(new King(board, Color.BLACK), new Position(5, 4));
        board.placePiece(new Rook(board, Color.WHITE), new Position(7, 2));
    }

}
