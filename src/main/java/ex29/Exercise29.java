/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex29;
import java.util.*;

public class Exercise29 {
    public static void main(String[] args) {
        double rate = input();
        int years = years(rate);

        System.out.printf("It will take %d years to double your initial investment", years);
    }

    public static double input() {
        Scanner in = new Scanner(System.in);
        boolean valid = false;
        double returnRate = 0;
        String rate;

        while (!valid) {
            System.out.print("What is the rate of return? ");
            rate = in.nextLine();

            // If the string can't convert to a double, then it's not numerical
            try {
                returnRate = Double.parseDouble(rate);
            } catch (NumberFormatException e) {
                System.out.println("Sorry, that is not a valid input.");
                continue;
            }

            // 0 is not allowed
            if (returnRate == 0) {
                System.out.println("Sorry, that is not a valid input.");
                continue;
            }

            valid = true;
        }

        return returnRate;
    }

    public static int years(double rate) {
        double years = 72 / rate;
        return (int)years;
    }
}
