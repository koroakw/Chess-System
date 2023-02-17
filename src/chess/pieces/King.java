package chess.pieces;

import boardgame.Board;
import chess.Color;
import chess.chessPiece;

public class King extends chessPiece {
    public King(Board board, Color color){
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
