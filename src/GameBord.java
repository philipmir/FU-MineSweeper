public class GameBord {
    private final Square[][] gameTable;

    public GameBord() {
        this.gameTable  = new Square[5][4];
        for(int x = 0; x < 5; x++){
            for(int y = 0; y < 4; y++){
                this.gameTable[x][y] = new Square();
            }
        }
    }


    public Square[][] getGameTable() {
        return gameTable;
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
