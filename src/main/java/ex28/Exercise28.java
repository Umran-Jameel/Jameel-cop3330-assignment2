/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex28;
import java.util.*;

public class Exercise28 {
    public static void main(String[] args) {
        double[] values = new double[5];

        Scanner input = new Scanner(System.in);
        String in;

        // storing the values in an array
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            in = input.nextLine();
            values[i] = Double.parseDouble(in);
        }

        double sum = addNumbers(values);

        System.out.printf("The total is %d.", (int)sum);
    }

    public static double addNumbers(double[] values) {
        double sum = 0;

        // adding the values in the array
        for (int i = 0; i < 5; i++) {
            sum += values[i];
        }

        return sum;
    }
}
