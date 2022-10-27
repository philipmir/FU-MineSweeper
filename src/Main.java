import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Game.startText();
        String playAgain = null;
        do {
            if(playAgain != null)
                Game.selectNumberOfMines();
            Game.gamePlay();
            System.out.println("Do you like to play again? yes/no");
            playAgain=scan.next().toLowerCase();
        }while(playAgain.equals("yes"));

    }
}