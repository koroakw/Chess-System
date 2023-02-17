package application;

import chess.chessPiece;

public class UI {
    public static void Printboard(chessPiece[][] pieces ){//imprime as posições do tabuleiro
    for (int i=0; i<pieces.length; i++){
            System.out.print((8-i) + " ");
            for (int j=0; j< pieces.length; j++){
                printPiece(pieces[i][j]);
            }
        System.out.println();
        }
        System.out.println("   a b c d e f g h");

    }

    private static void printPiece(chessPiece piece){//imprime a peça
    if (piece == null){
        System.out.print(" -");

    }else{
        System.out.print(" " + piece);
    }
    }
}
