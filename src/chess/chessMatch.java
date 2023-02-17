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
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (chessPiece) board.piece(i, j);//realiza um downcast para chesspiece
            }
        }
        return mat;//retorna a matriz de peças de xadrez
    }

    private void placeNewPiece(char column, int row, chessPiece piece) {
        board.placePiece(piece, new ChessPosition(column, row).toPosition());//instancia as peças de xadrez informando as coordenadas no tabuleiro
        //e coloca a peça passando a posição nas coordenadas do xadrez
    }

    private void initialSetup() {
        placeNewPiece('c', 1, new Rook(board, Color.WHITE));
        placeNewPiece('c', 2, new Rook(board, Color.WHITE));
        placeNewPiece('d', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 1, new Rook(board, Color.WHITE));
        placeNewPiece('d', 1, new King(board, Color.WHITE));

        placeNewPiece('c', 7, new Rook(board, Color.BLACK));
        placeNewPiece('c', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 8, new King(board, Color.BLACK));

    }
}
