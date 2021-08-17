package boardGame;

public abstract class Piece {

    protected Position position;
    private Board board;

    public Piece() {

    }

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    } //Somente classes dentro do mesmo pacote e sub-classes terão acesso

    //Não vamos permitir que o tabuleiro seja alterado, por isso, tiramos o set.

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat.length; j++) {
                if (mat[i][j])  {
                    return true;
                }
            }
        }
        return false;
    }

}
