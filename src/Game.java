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
        mineCount = scan.nextInt();  // Ask player how many mines and set it in fillWithMines()
        System.out.println("Welcome " + player.getName() + ". You are playing with " + mineCount + " mines, type your first move, row and column:");

    }

    public static void gamePlay(){
        Scanner scan= new Scanner(System.in);
        GameBord table= new GameBord();
        table.fillWithMines();
        table.print();
        boolean gameEnded = false;
        int questionmarksRemaining = 20;


        do{
            System.out.println("row: ");
            String row= scan.next();
            System.out.println("column: ");
            String column = scan.next();
            Square square = table.move(row,column);
            //countUncovered++;//count for how many tiles are uncovered, for winning argument below
            //System.out.println(" ? uncovered: " + countUncovered);//for developing purposes, comment out if game finished
            table.print();
            if (square.isMineHere==true) {
                System.out.println("Boom!! there is a bomb");
                gameEnded=true;
            }
            if(square.isUncovered==true){//it's not watertight. If you make a invalid move it still counts instead of ignores the already opened field.
                questionmarksRemaining--;
                System.out.println("Questionmarks remaining: " +questionmarksRemaining);
            }
            if (questionmarksRemaining == mineCount){//
                System.out.println("Yeah, you won!! You found all the mines");
                gameEnded=true;
            }

        }while(!gameEnded);


    }

}
