/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex25;
import java.util.*;

public class Exercise25 {
    public static void main(String[] args) {
        String password = "abc234xyz!";

        int strength = passwordValidator(password);
        String output;

        switch (strength) {
            case 0: output = String.format("The password \"%s\" is a very weak password.", password);
                    break;
            case 1: output = String.format("The password \"%s\" is a weak password.", password);
                    break;
            case 2: output = String.format("The password \"%s\" is a strong password.", password);
                    break;
            case 3: output = String.format("The password \"%s\" is a very strong password.", password);
                    break;
            default: output = "";
        }
        System.out.println(output);
    }

    public static int passwordValidator(String password) {
        char[] arr = password.toCharArray();

        // checking if it's all numbers
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isDigit(arr[i]))
                break;

            if (i == password.length() - 1) {
                if (password.length() < 8)
                    return 0; // very weak
            }
        }

        // checking if it's all letters
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetter(arr[i]))
                break;

            if (i == password.length() - 1) {
                if (password.length() < 8)
                    return 1; // weak
            }

        }

        // checking if there's numbers and letters and special characters
        boolean hasLetter = false, hasNumber = false, hasSpecial = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLetter(arr[i]))
                hasLetter = true;
            else if (Character.isDigit(arr[i]))
                hasNumber = true;
            else if ((!Character.isLetter(arr[i])) && (!Character.isDigit(arr[i])) && (!Character.isWhitespace(arr[i])))
                hasSpecial = true;
        }

        if (hasSpecial && hasLetter && hasNumber && (password.length() >= 8))
            return 3; // very strong
        else if (hasLetter && hasNumber && (password.length() >= 8))
            return 2; // strong

        return 0;
    }
}
