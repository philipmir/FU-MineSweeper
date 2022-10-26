public class Square {
    public int numberOfMinesAround;

    public boolean isMineHere;

    public boolean isUncovered;

    public int row;

    public int column;



    public Square() {
        row = 0;
        column = 0;
        numberOfMinesAround = 0;
        isMineHere = false;
        isUncovered = false;
    }
}