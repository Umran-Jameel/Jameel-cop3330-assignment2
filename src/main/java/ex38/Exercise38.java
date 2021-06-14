/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex38;
import java.util.*;

public class Exercise38 {
    public static void main(String[] args) {
        System.out.print("Enter a list of values separated by a space: ");

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        char[] arr = input.toCharArray();
        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                continue;
            }
            else {
                nums.add((int)arr[i]);
            }
        }
        ArrayList<Integer> ret = new ArrayList<Integer>();

        ret = evenNums(nums);

        System.out.print("The even numbers are: ");
        for (int i = 0; i < ret.size() - 1; i++) {
            System.out.printf("%d ", ret.get(i) - 47); // getting the right values in the ascii table
        }


    }

    public static ArrayList<Integer> evenNums(ArrayList<Integer> arr) {
        ArrayList<Integer> evens = new ArrayList<Integer>();

        for (int i = 0; i < arr.size(); i++) {
            if ((arr.get(i) + 1) % 2 == 0) {
                evens.add(arr.get(i));
            }
        }

        return evens;
    }
}
