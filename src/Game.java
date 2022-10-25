import java.util.Scanner;

public class Game {
    static Scanner scan = new Scanner(System.in);
    static Player player = new Player();
    static GameBord table = new GameBord();
    static int mineCount;


    public static void startText() {
        System.out.println("Welcome to MineSweeper!");
        System.out.println("What is your name?");
        player.setName(scan.nextLine());
        System.out.println("How many mines do you want? 1-19 (recommended is 4)");
        mineCount = scan.nextInt();  // Ask player how many mines and set it in fillWithMines()
        System.out.println("Welcome " + player.getName() + ". You are playing with " + mineCount + " mines, type your first move, row and column:");

    }

    public static void gamePlay(){
        table.fillWithMines();
        table.printRevealed(); //for development only
        table.print();
        boolean gameEnded = false;
        do{
            System.out.println("row: ");
            String row= scan.next();
            System.out.println("column: ");
            String column = scan.next();
            Square square = table.move(row,column);
            //countUncovered++; count for how many tiles are uncovered, for winning argument below
            //System.out.println(" ? uncovered: " + countUncovered);//for developing purposes, comment out if game finished
            if (square.isMineHere) {
                System.out.println("Boom!! there is a bomb");
                gameEnded=true;
            }
            if(square.isUncovered){//it's not watertight. If you make an invalid move it still counts instead of ignores the already opened field.
                table.questionMarksRemaining--;
                System.out.println("Question marks remaining: " + table.questionMarksRemaining);

                if(square.numberOfMinesAround == 0) {
                    table.uncoverAroundZeros(square.row,square.column);
                }
            }
            if (table.questionMarksRemaining == mineCount){//
                System.out.println("Yeah, you won!! You found all the mines");
                break;
            }

            table.print();
        }while(!gameEnded);
    }
}
