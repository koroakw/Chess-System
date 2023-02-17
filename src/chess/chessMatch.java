package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class chessMatch {//nessa classe instancia a partida de xadrez, e que instancia as regras
    // e informa qual é a dimensão de um jogo de xadrez
    private Board board;

    public chessMatch() {
        board = new Board(8, 8);//define a dimensão de um jogo de xadrez
        initialSetup();
    }

    public chessPiece[][] getPieces() {//esse método retorna o piece da camada xadrez e não da classe piece do boardgame
        chessPiece[][] mat = new chessPiece[board.getRows()][board.getColumns()];//coloca a posição da peça no tabuleiro
        for(int i=0;i<board.getRows(); i++){
            for(int j=0; j< board.getColumns(); j++){
                mat[i][j] = (chessPiece) board.piece(i, j);//realiza um downcast para chesspiece
            }
        }
      return mat;//retorna a matriz de peças de xadrez
    }
    private void initialSetup(){
        board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1) );
        board.placePiece(new King(board, Color.BLACK), new Position(0, 4) );
        board.placePiece(new King(board, Color.BLACK), new Position(7, 4) );
    }
}

