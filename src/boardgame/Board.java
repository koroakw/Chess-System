package boardgame;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if (rows<1 || columns<1){
            throw new BoardException(" Error creating board: threre must be at laeast 1 row and 1 column.");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }



    public int getColumns() {
        return columns;
    }



    public Piece piece(int row, int column){
        if(!positionExists(row, column)){
            throw new BoardException("Position not on the board");
        }
        return pieces[row][column];

    }public Piece piece(Position position) {
        return pieces[position.getRow()][position.getColumn()];
    }
    public void placePiece(Piece piece, Position position){//método responsável por alterar a posição da peça
    if (thereIsApiece(position)){
        throw new BoardException("There is already a piece on position " + position);
    }
        pieces[position.getRow()][position.getColumn()] = piece;//atribui a matriz á peça que foi informada
        piece.position = position;//acessa a posição da peça
    }
    private boolean positionExists(int row, int column){
     return  row>=0 && row < rows && column >= 0 && column < columns;//determina se a peça existe ou não
    }
    public boolean positionExists(Position position){
    return positionExists(position.getRow(), position.getColumn());
    }
public boolean thereIsApiece (Position position){
    if(!positionExists(position)){
        throw new BoardException("Position not on the board");
    }
   return piece(position) !=null;
}
}
