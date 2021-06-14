/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex32;
import java.util.*;

public class Exercise32 {
    public static void main(String[] args) {
        System.out.println("Let's play guess the number!");

        boolean play = true;

        Scanner input = new Scanner(System.in);
        String in;

        // loops until user doesn't want to play anymore
        while (play) {
            boolean res = game();
            System.out.print("Do you wish to play again? (Y/N) ");
            in = input.nextLine();

            if (in.equals("Y")) {
                continue;
            }
            else {
                break;
            }
        }
    }

    public static boolean game() {
        Scanner in = new Scanner(System.in);

        int difficulty = 0;
        while (difficulty == difficulty) {
            System.out.print("Please enter the difficulty (1, 2, or 3): ");

            String diff = in.nextLine();
            try {
                difficulty = Integer.parseInt(diff);
            } catch (NumberFormatException e) {
                System.out.println("Please enter either 1, 2, or 3 for the difficulty.");
                continue;
            }

            break;
        }

        Random rand = new Random();
        int rand_int;

        // generating random number based on the difficulty
        if (difficulty == 1) {
            rand_int = rand.nextInt(10) + 1; // random number between 1-10
        }
        else if (difficulty == 2) {
            rand_int = rand.nextInt(100) + 1; // 1-100
        }
        else
            rand_int = rand.nextInt(1000) + 1; // 1-1000

        System.out.print("I have my number! What's your guess? ");

        String input;
        int guess = 0;
        int tries = 1;

        // loops until user gets it correct
        while(guess == guess) {
            input = in.nextLine();

            try {
                guess = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.print("Wrong. Try again.");
                tries++;
                continue;
            }

            if (guess < rand_int) {
                System.out.print("Too low, guess again. ");
                tries++;
                continue;
            }
            else if (guess > rand_int) {
                System.out.print("Too high, guess again. ");
                tries++;
                continue;
            }
            else {
                System.out.printf("You got it in %d guesses!\n", tries);
                return true;
            }
        }

        return false;
    }
}
