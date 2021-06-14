/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex36;
import java.util.*;

public class Exercise36 {
    public static void main(String[] args) {
        ArrayList<Double> arr = new ArrayList<Double>();

        Scanner in = new Scanner(System.in);
        double entry;
        String input;
        int var = 0;

        while(var == var) {
            System.out.print("Enter a number: ");
            input = in.nextLine();

            if (input.equals("done")) // once the user enters done, the arraylist ends
                break;

            try {
                entry = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter either a number or the word done.");
                continue;
            }


            arr.add(entry);
        }

        System.out.printf("The numbers are ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.printf("%f ", arr.get(i).doubleValue());
        }

        output(arr);

    }

    public static void output(ArrayList<Double> arr) {
        Calculations result = new Calculations();

        System.out.printf("\nThe average is: %f\nThe minimum is: %f\nThe maximum is: %f\nThe standard deviation is: %f", result.average(arr), result.min(arr), result.max(arr), result.std(arr));
    }
}
