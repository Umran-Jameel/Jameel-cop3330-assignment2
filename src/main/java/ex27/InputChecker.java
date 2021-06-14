/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex27;

public class InputChecker {
    public String validateFirstName(String firstName) {
        String output;

        if (firstName.isEmpty() || firstName.isBlank()) {
            output = "The first name must be filled in.";
        }
        else if (firstName.length() < 2) {
            output = "The first name must be at least 2 characters long.";
        }
        else
            return null;

        return output;
    }

    public String validateLastName(String lastName) {
        String output;

        if (lastName.isEmpty() || lastName.isBlank()) {
            output = "The last name must be filled in.";
        }
        else if (lastName.length() < 2) {
            output = "The last name must be at least 2 characters long.";
        }
        else
            return null;

        return output;
    }

    public String validateZip(String zipCode) {
        String output;
        char[] arr = zipCode.toCharArray();

        for (int i = 0; i < zipCode.length(); i++) {
            if (!Character.isDigit(arr[i])) {
                output = "The zip code must be a number.";
                return output;
            }
            else
                continue;
        }

        return null;

    }

    public String validateEmploysID(String ID) {
        String output;

        char[] arr = ID.toCharArray();
        for (int i = 0; i < 2; i++) {
            if (!Character.isLetter(arr[i])) {
                output = "The Employee ID must be in the form of AA-1234.";
                return output;
            }
            else
                continue;
        }

        if (arr[2] != '-') {
            output = "The Employee ID must be in the form of AA-1234.";
            return output;
        }

        for (int i = 3; i < 7; i++) {
            if (!Character.isDigit(arr[i])) {
                output = "The Employee ID must be in the form of AA-1234.";
                return output;
            }
            else
                continue;
        }

        return null;
    }
}
