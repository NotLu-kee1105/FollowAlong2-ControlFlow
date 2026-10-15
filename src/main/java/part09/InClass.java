package part09;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps.

import java.util.Random;
import java.util.Scanner;

public class InClass {
    public static void main(String[] args) {

        // STEP 1 — PLAN the guessing game together. No code yet.
        // Write each step of the game as a // comment, in plain English, in order.
        // 1.We need the user to inpiut a number so a scanner
        // 2. We need a while loop to see if what the user input was too low or too high or its the correct
        // 3.We also need a dice roll so we need Math.random
        //4.We need the computer to keep two variables one for the secret number which will use the Math.random and the user guess at its default 0



        // STEP 2 — fix the bugs. Each bug below is inside its own /* ... */.
        // Do ONE bug at a time: delete its /* line and its */ line, so Java sees it.
        // Read the red error (or watch what happens). Fix it. Run it. Then do the next bug.


        Random random = new Random(); //forgot the semicolon
        System.out.println("Random works: " + (random.nextInt(6) + 1));



        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a number: ");
        int guess = scanner.nextInt();//The I need to be capital
        System.out.println("You typed " + guess);



        int count = 1;
        while (count <= 3) { //needs count++
            System.out.println("Guess number " + count);
            count++;
        }

    }
}
