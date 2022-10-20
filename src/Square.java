public class Square {
    public int numberOfMinesAround;

    public boolean isMineHere;

    public boolean isUncovered;


    //Coordinates could be used when passing an individual square between functions.
    //If we don't find use to it, we should remove it!

    //Vertical coordinate
    public int row;
    //Horizontal coordinate.
    public int column;



    public Square() {
        row = 0;
        column = 0;
        numberOfMinesAround = 0;
        isMineHere = false;
        isUncovered = false;
    }
}
