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
        selectNumberOfMines();
        System.out.println("Welcome " + player.getName() + ". You are playing with " + mineCount + " mines, type your first move, row and column:");
    }

    public static void selectNumberOfMines(){
        System.out.println("How many mines do you want? 1-19 (recommended is 4)");
        inputMinesCount();
    }

    public static void gamePlay(){
        table= new GameBord();
        table.fillWithMines();
        table.printRevealed(); //for development only
        table.print();
        do{
            System.out.println("row: ");
            String row= scan.next();
            System.out.println("column: ");
            String column = scan.next();
            if (table.checkInput(row, column)) {
                Square square = table.move(row, column);
                if (square.isMineHere) {
                    System.out.println("Boom!! there is a bomb");
                    System.out.println("Here are the mine locations.");
                    table.printRevealed(); // Show the board/mines
                    break;
                }
                if (square.isUncovered) {
                    table.questionMarksRemaining--;

                    if (square.numberOfMinesAround == 0) {
                        table.uncoverAroundZeros(square.row, square.column);
                    }

                    System.out.println("Question marks remaining: " + table.questionMarksRemaining);
                }
                if (table.questionMarksRemaining == mineCount) {//
                    System.out.println("Yeah, you won!! You found all the mines");
                    break;
                }

                table.print();
            }
        }while(true);
    }

    private static void inputMinesCount() {
        while (true) {
            try {
                mineCount = scan.nextInt();  // Ask player how many mines and set it in fillWithMines()
                if (mineCount < 1) {
                    System.out.println("You took too few mines! Try again 1-19");
                } else if (mineCount > 19) {
                    System.out.println("You took too many mines! Try again 1-19");
                } else {
                    break;
                }
            }catch(Exception e){
                System.out.println("Error! Try again 1-19.");
                scan.nextLine();
            }
        }
    }
}
