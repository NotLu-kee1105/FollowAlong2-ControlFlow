package part09;

// Part 09 — CHECKPOINT. No video in this part.
// Reminders: while loops — part 07 · Scanner — part 03 · Random — part 05
// Video (only if you need it): https://www.youtube.com/watch?v=xk4_1vDrzzo
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

import java.util.Random;
import java.util.Scanner;

public class Stretch {
    public static void main(String[] args) {
        /* My Guess:
        1. 5. 32
        2.7 is odd 4 is even 1 is odd
         */
        int count = 0;
        int n = 1;
        while (n < 20) {
            n = n * 2;
            count++;
        }
        System.out.println(n + " " + count);

        int x = 7;
        while (x > 0) {
            if (x % 2 == 0) {
                System.out.println(x + " is even");
            } else {
                System.out.println(x + " is odd");
            }
            x -= 3;
        }

        //B1
        int sum = 0;
        int i = 1;
        while (i <= 10){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum:"+sum);

        Scanner sc = new  Scanner(System.in);
        int pick = 0;
        while (pick < 1 || pick > 10){
            System.out.print("Pick a number from 1 to 10: ");
            pick = sc.nextInt();
        }
        System.out.println("Thanks you picked "+ pick + ".");

        Random random = new Random();
        int roll = 0;
        count = 0;
        while (roll != 6){
            roll = random.nextInt(6)+1;
            System.out.println("Rolled a "+roll);
            count++;

        }
        System.out.println("It took "+count+" rolls to get a 6");
    }
}
