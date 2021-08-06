package boardGame;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board() {

    }

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public Piece piece(int row, int column) {
        return pieces[row][column];
    } //Essa função vai me retornar a peça na linha e coluna.

    public Piece piece(Position position) {
        return pieces[position.getRow()][position.getColumn()];
    } //Vai me retornar a peça em x posição em x linha e x coluna.

}
