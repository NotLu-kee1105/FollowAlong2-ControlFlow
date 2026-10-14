package part08;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5836s
//        starts at 1:37:16 — stop at about 1:42:48, at "well ladies and gentlemen"
// Guide: GUIDE.md in this folder, steps 6–10
//
// Part 08 — nested loops (a loop inside another loop)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called NestedLoops.
//    Leave the "package part08;" line and the class line alone. Type everything else.
//    When you type Scanner, IntelliJ will want an import. See the README.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
//an Import of Scanner
import java.util.Scanner;
//creates a class called Nested Loops
public class NestedLoops {
    //the main method the starting point
    public static void main(String[] args) {
        //Creates a scanner obkect named scanner so you can read input
        Scanner scanner = new Scanner(System.in);
        //These variables will store the users input
        int rows;
        int columns;
        String symbol = "";
        //Ask the user to enter the number of rows
        System.out.println("Enter number of rows:");
        //Prints the amount of rows the user wants
        rows = scanner.nextInt();
        //Prints the user input of number of columns
        System.out.println("Enter number of columns:");
        //inputs columns the user wanted
        columns = scanner.nextInt();
        //ask the user to get what symbol
        System.out.println("Enter symbol to use:");
        //input the symbol into a variable called symbol
        symbol = scanner.next();
        //for loop where the start is 1 and stops when i is less than or equal amount of rows inputted. And increase by 1
        for (int i = 1; i <= rows; i++) {
            //An inner loop that controls the number of columns
            for (int j = 1; j <= columns; j++) {
                //This for loop prints the symbols across the rows
                System.out.print(symbol);
                //prints the symbols
            }
        }
    }

}
