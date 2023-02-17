package boardgame;

public class Piece {
    protected Position position;//está em protected pois não é a posição do xadrez ainda
    //mas sim uma posição de matriz , e não queremos que seja visível na camada do xadrez
    private Board board;

    public Piece(Board board) {// não colocaremos a peça pois a posição de uma peça recém criada é inicialmente nula nula
        //pois a peça ainda não foi posta no tabuleiro
        this.board = board;
        position = null;
    }

    protected Board getBoard() {// está protected pois somente classes e subclasses de dentro do mesmo pacote boardgame
        //poderão acessar o tabuleiro de uma peça
        return board;
    }


}
