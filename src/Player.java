import java.util.Scanner;

public class Player {
Scanner scan = new Scanner(System.in);
    private static String name;

    public Player() {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void startText() {
        System.out.println("Welcome to MineSweeper!");
        System.out.println("What is your name?");
        Player.name = scan.nextLine();
        System.out.println("Welcome " + name + ", type your first move, row and column:");

    }
}
