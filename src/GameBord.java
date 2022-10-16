public class GameBord {
    private String[][] GameTable;

    public GameBord() {
        this.GameTable = new String[][]{
                {" ? ", " ? ", " ? ", " ? ", " ? "},
                {" ? ", " ? ", " ? ", " ? ", " ? "},
                {" ? ", " ? ", " ? ", " ? ", " ? "},
                {" ? ", " ? ", " ? ", " ? ", " ? "}



        };
    }


    public String[][] getGameTable() {

        return GameTable;
    }


    public void print() {
        System.out.println("   1   2   3   4   5");
        System.out.println("a " +GameTable[0][0] + "|" +GameTable[0][1] + "|"+ GameTable[0][2] + "|"+ GameTable[0][3] + "|"+ GameTable[0][4]);
        System.out.println("  ---+---+---+---+---");
        System.out.println("b "+ GameTable[1][0] + "|" +GameTable[1][1] + "|"+ GameTable[1][2] + "|"+ GameTable[1][3] + "|"+ GameTable[1][4]);
        System.out.println("  ---+---+---+---+---");
        System.out.println("c "+GameTable[2][0] + "|" +GameTable[2][1] + "|"+ GameTable[2][2] + "|"+ GameTable[2][3] + "|"+ GameTable[2][4]);
        System.out.println("  ---+---+---+---+---");
        System.out.println("d "+GameTable[3][0] + "|"+ GameTable[3][1] + "|"+ GameTable[3][2] + "|"+ GameTable[3][3] + "|"+ GameTable[3][4]);

    }
}
