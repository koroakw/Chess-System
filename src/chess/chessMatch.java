package chess;

import boardgame.Board;

public class chessMatch {//nessa classe que informa qual é a dimensão de um jogo de xadrez
    private Board board;

    public chessMatch() {
        board = new Board(8, 8);//define a posição do jogo de xadrez
    }

    public chessPiece[][] getPieces() {//esse método retorna o piece da camada xadrez e não da classe piece do boardgame
        chessPiece[][] mat = new chessPiece[board.getRows()][board.getColumns()];//coloca a posição da peça no tabuleiro
        for(int i=0;i<board.getRows(); i++){
            for(int j=0; i< board.getColumns(); i++){
                mat[i][j] = (chessPiece) board.pieces(i, j);//realiza um downcast para chesspiece
            }
        }
      return mat;}//retorna a matriz de peças de xadrez
    }

