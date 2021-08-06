package boardGame;

public class Piece {

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

}
