import java.util.Scanner;

public class Game {
    static Scanner scan = new Scanner(System.in);
    static Player player = new Player();
    static GameBord gamebord = new GameBord();

    static int mineCount;


    public static void startText() {
        System.out.println("Welcome to MineSweeper!");
        System.out.println("What is your name?");
        player.setName(scan.nextLine());
        System.out.println("How many mines do you want? 1-19");
        mineCount = scan.nextInt();
        System.out.println("Welcome " + player.getName() + ". You are playing with " + mineCount + " mines, type your first move, row and column:");

    }

}
