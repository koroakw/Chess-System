package application;

import boardgame.Board;
import boardgame.Position;
import chess.chessMatch;

public class Program {
    public static void main (String []args){
        chessMatch chessmatch = new chessMatch();
        UI.Printboard(chessmatch.getPieces());//chama o método de inferface do usuário
        //e chama as as peças para o tabuleiro

    }
}
