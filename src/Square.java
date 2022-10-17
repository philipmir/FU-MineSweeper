public class Square {
    public int numberOfMinesAround;

    public boolean isMineHere;

    public boolean isUncovered;


    //Coordinates could be used when passing an individual square between functions.
    //If we don't find use to it, we should remove it!

    //Horizontal coordinate.
    public int x;
    //Vertical coordinate
    public int y;


    public Square() {
        x = 0;
        y = 0;
        numberOfMinesAround = 0;
        isMineHere = false;
        isUncovered = false;
    }
}
