public class Main {
    public static void main(String[] args) {
        GameBord board = new GameBord();
        Game game = new Game();

        game.startText();
        board.fillWithMines();
        board.print();


        board.printRevealed();  //This should be removed when development is finished




    }
}