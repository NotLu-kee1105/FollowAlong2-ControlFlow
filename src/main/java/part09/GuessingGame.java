package part09;

// Part 09 — CHECKPOINT. No video in this part.
// Video (only if you need a reminder): https://www.youtube.com/watch?v=xk4_1vDrzzo
//   user input (Scanner) — part 03 · random numbers — part 05
//   if statements — part 06 · while loops — part 07
//
// SECTION A — BUILD: write a number guessing game in this class, starting from nothing.
//    The README has the full list of rules and a sample run.
//    Leave the "package part09;" line and the class line alone. Type everything else,
//    including main and the import lines.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.
//Imports the Scanner class from Java
import java.util.Scanner;
//Creates a class called Guessing Game
public class GuessingGame {
    // 1.We need the user to inpiut a number so a scanner
    // 2. We need a while loop to see if what the user input was too low or too high or its the correct
    // 3.We also need a dice roll so we need Math.random
    //4.We need the computer to keep two variables one for the secret number which will use the Math.random and the user guess at its default 0
   //The main method what runs the program
    public static void main(String[] args) {
        //Creates the scanner object called sc
        Scanner sc = new Scanner(System.in);
        //creates a variable called secret that generates a random number from 1-100
        int secret = (int)(Math.random()*100)+1;
        //creates a variable called count which its default value is 0
        int count = 0;
        //creates a variable called guess with its default value of 0
        int guess = 0;
        //prints Im thinking of a number
        System.out.println("I'm thinking of a number between 1 and 100");
        //Prints teh secret number with the variable secret
        System.out.println("(secret: "+secret + ")");
        //Creates a while loop witha  conditioonal if guess does not equal secret
        while (guess != secret){
            //prints your guess
            System.out.println("Your guess: ");
            //the user input will print on the next line
            guess = sc.nextInt();
            //increase each count
            count++;
            //inside the while loop is a if statement with a condition if guess is less than secret.
            if (guess < secret) {
                //if that condition is met prints too low
                System.out.println("Too Low!");
                //An else if statement with the condition guess > secret
            } else if (guess > secret) {
                //prints Too High
                System.out.println("Too High!");
                //final else statement
            }else {
                //prints if that condiition is met using the variable count that tracks how many times teh user guessed
                System.out.println("Correct! You got it in " + count + " guesses");
            }
        }
    }
}
