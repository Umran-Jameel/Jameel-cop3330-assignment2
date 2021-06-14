/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex35;
import java.util.*;

public class Exercise35 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();

        Scanner in = new Scanner(System.in);
        String entry = "voubweiofjvr34rimv8"; // random junk
        int var = 0;

        while(var == var) {
            System.out.print("Enter a name: ");
            entry = in.nextLine();

            if (entry.isEmpty()) // if the user doesn't type anything, arraylist ends there
                break;

            arr.add(entry);
        }

        Random rand = new Random();

        int rand_int = rand.nextInt(arr.size());

        String winner = getWinner(arr, rand_int);

        System.out.print("The winner is...." + winner);

    }

    public static String getWinner(ArrayList arr, int rand_int) {
        return arr.get(rand_int).toString(); // returns a random one of the entries in string form
    }
}
