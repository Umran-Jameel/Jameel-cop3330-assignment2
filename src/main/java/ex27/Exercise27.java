/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex27;
import java.util.*;

public class Exercise27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String first, last, zip, ID;

        System.out.print("Enter the first name: ");
        first = in.nextLine();
        System.out.print("Enter the last name: ");
        last = in.nextLine();
        System.out.print("Enter the zip code: ");
        zip = in.nextLine();
        System.out.print("Enter the employee ID: ");
        ID = in.nextLine();

        validateInput(first, last, zip, ID);

    }

    public static void validateInput(String first, String last, String zip, String ID) {
        String[] output = new String[5];
        int i = 0;

        InputChecker check = new InputChecker();

        String ret;
        ret = check.validateFirstName(first);
        if (ret != null) {
            output[i] = ret;
            i++;
        }

        ret = check.validateLastName(last);
        if (ret != null) {
            output[i] = ret;
            i++;
        }

        ret = check.validateZip(zip);
        if (ret != null) {
            output[i] = ret;
            i++;
        }

        ret = check.validateEmploysID(ID);
        if (ret != null) {
            output[i] = ret;
            i++;
        }

        if (output[0] == null) {
            output[0] = "There were no errors found.";
            i++;
        }

        for (int j = 0; j < i; j++) {
            System.out.println(output[j]);
        }

    }
}
