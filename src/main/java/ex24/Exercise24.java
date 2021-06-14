/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex24;
import java.util.*;

public class Exercise24 {
    public static void main(String[] args) {
        System.out.println("Enter two strings and i'll tell you if they're anagrams: ");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String first = input.nextLine();
        System.out.print("Enter the second string: ");
        String second = input.nextLine();

        boolean result = isAnagram(first, second); // checks if the strings are anagrams
        String output;

        if (result) {
            output = String.format("\"%s\" and \"%s\" are anagrams.", first, second);
        }
        else {
            output = String.format("\"%s\" and \"%s\" are not anagrams.", first, second);
        }

        System.out.println(output);
    }

    public static boolean isAnagram(String first, String second) {

        if (first.length() != second.length()) { // checks the lengths to see if they're equal
            return false;
        }

        first = first.toLowerCase();
        second = second.toLowerCase();

        // strings to character array
        char[] str1 = first.toCharArray();
        char[] str2 = second.toCharArray();

        int[] arr1 = new int[str1.length];
        int[] arr2 = new int[str1.length];

        // char arrays to int arrays (ASCII values)
        for (int i = 0; i < str1.length; i++) {
            arr1[i] = (int)str1[i];
            arr2[i] = (int)str2[i];
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // checking sorted arrays to see if they're equal
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
            else
                continue;
        }

        return true;


    }
}
