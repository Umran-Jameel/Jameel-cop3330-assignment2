/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex31;
import java.util.*;

public class Exercise31 {
    public static void main(String[] args) {
        double[] in;
        in = input();

        double[] values = calculations(in);

        generateTable(values);

    }

    public static double[] input() {
        double[] ret = new double[2]; // Storing the input (resting heart rate and age) in an array

        Scanner in = new Scanner(System.in);
        boolean valid = false;
        String inp;

        // loop to trap bad input
        while (!valid) {
            System.out.print("Enter your resting heart rate: ");
            inp = in.nextLine();

            try {
                ret[0] = Double.parseDouble(inp);
            } catch (NumberFormatException e) {
                System.out.println("Please enter in number format.");
                continue;
            }

            valid = true; // to exit the loop
        }

        valid = false;

        while (!valid) {
            System.out.print("Enter your age: ");
            inp = in.nextLine();

            try {
                ret[1] = Double.parseDouble(inp);
            } catch (NumberFormatException e) {
                System.out.println("Please enter in number format.");
                continue;
            }

            valid = true;
        }

        return ret;

    }

    public static double[] calculations(double[] arr) {
        double[] ret = new double[9];
        int j = 0;

        // doing the calculations and storing them into an array
        for (int i = 55; i <= 95; i += 5) {
            ret[j] = (((220 - arr[1]) - arr[0]) * ((double)i/100)) + arr[0];
            System.out.println(ret[j]);
            j++;
        }

        return ret;
    }

    public static void generateTable(double[] arr) {
        System.out.println("Intenisty  | Rate   ");
        System.out.println("-----------|--------");

        int j = 0;

        for (int i = 55; i <= 95; i += 5) {
            System.out.printf("%d         | %.0f bpm\n", i, arr[j]);
            j++;
        }

    }
}
