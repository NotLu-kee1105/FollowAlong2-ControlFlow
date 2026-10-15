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

import java.util.Scanner;

public class GuessingGame {
    // 1.We need the user to inpiut a number so a scanner
    // 2. We need a while loop to see if what the user input was too low or too high or its the correct
    // 3.We also need a dice roll so we need Math.random
    //4.We need the computer to keep two variables one for the secret number which will use the Math.random and the user guess at its default 0
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secret = (int)(Math.random()*100)+1;
        int count = 0;
        int guess = 0;
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(secret: "+secret + ")");
        while (guess != secret){
            System.out.println("Your guess: ");
            guess = sc.nextInt();
            count++;

            if (guess < secret) {
                System.out.println("Too Low!");
            } else if (guess > secret) {
                System.out.println("Too High!");
            }else {
                System.out.println("Correct! You got it in " + count + " guesses");
            }
        }
    }
}
