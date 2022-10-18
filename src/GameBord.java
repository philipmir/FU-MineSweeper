import java.util.Random;

public class GameBord {
    Random rand = new Random();
    private final Square[][] gameTable;

    public GameBord() {
        this.gameTable  = new Square[5][4];
        for(int x = 0; x < 5; x++){
            for(int y = 0; y < 4; y++){
                this.gameTable[x][y] = new Square();
            }
        }
    }


    public Square wantedPosition(int raw, String colonInLetters){ // returns the position selected by the player by typing the wanted raw (1-5) and the wanted colon (a-e).
        int colonInNumbers = colonInLetters.charAt(0)-97; // converts the colon from the letter to number (a-e) to (0-4)
        return(gameTable[raw-1][colonInNumbers]);// returns the wanted position raw(1-4) to (0-3).
    }


    public Square[][] getGameTable() {
        return gameTable;
    }

    public void fillWithMines() {
        for (int i = 0; i < 7; i++) { // setting 7 mines in 7 different squares.
            int x = rand.nextInt(5);
            int y = rand.nextInt(4);
            while (gameTable[x][y].isMineHere==true) { // to make sure that the square randomly picked has no mine in it,
                // if there is a mine in the square, just try to find another one with no mine.
                x = rand.nextInt(5);
                y = rand.nextInt(4);
            }
            gameTable[x][y].isMineHere=true;
        }
    }

    private String printSquare(int x, int y){
        if(!gameTable[x][y].isUncovered){
            return " ? ";
        }
        else {
            if(gameTable[x][y].isMineHere)
                return " x ";
            else
                return " " + gameTable[x][y].numberOfMinesAround + " ";
        }
    }


    public void print() {
        System.out.println("   a   b   c   d   e");
        System.out.println("1 " + printSquare(0,0) + "|" + printSquare(1,0) + "|"+ printSquare(2,0) + "|"+ printSquare(3,0) + "|" + printSquare(4,0));
        System.out.println("  ---+---+---+---+---");
        System.out.println("2 " + printSquare(0,1) + "|" + printSquare(1,1) + "|"+ printSquare(2,1) + "|"+ printSquare(3,1) + "|" + printSquare(4,1));
        System.out.println("  ---+---+---+---+---");
        System.out.println("3 " + printSquare(0,2) + "|" + printSquare(2,2) + "|"+ printSquare(2,2) + "|"+ printSquare(3,2) + "|" + printSquare(4,2));
        System.out.println("  ---+---+---+---+---");
        System.out.println("4 " + printSquare(0,3) + "|" + printSquare(3,3) + "|"+ printSquare(2,3) + "|"+ printSquare(3,3) + "|" + printSquare(4,3));
    }
}
