package chess;

import boardGame.Board;
import boardGame.Piece;

public abstract class ChessPiece extends Piece { //Peça de xadrez

    private Color color;

    public ChessPiece() {
         super();
    }

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}
