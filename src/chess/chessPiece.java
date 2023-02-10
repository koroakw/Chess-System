package chess;

import boardgame.Board;
import boardgame.Piece;

public class chessPiece extends Piece {
    Color color;


    public chessPiece(Board board, Color color) {
        super(board);// passa a chamada para o construtor da super classe
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
