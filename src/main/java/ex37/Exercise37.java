/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex37;
import java.util.*;

public class Exercise37 {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<Character>();
        List<Integer> numbers = new ArrayList<Integer>();
        List<Character> specials = new ArrayList<Character>();

        // adding all the letters based on the ASCII values
        for (int i = 0; i < 26; i++) {
            letters.add(i, (Character)((char)(i + 97)));
        }

        // adding all the numbers in the appropriate indices
        for (int i = 0; i < 10; i++) {
            numbers.add(i, i);
        }

        // adding all the special characters based on the ASCII values
        for (int i = 0; i < 31; i++) {
            specials.add(i, (Character)((char)(i + 31)));
        }

        int special;
        int length;
        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("What's the minimum length? ");
        length = input.nextInt();
        System.out.print("How many special characters? ");
        special = input.nextInt();
        System.out.print("How many numbers? ");
        number = input.nextInt();

        while (special + number > (length / 2)) {
            length++;
        }

        boolean status = generatePassword(letters, numbers, specials, special, length, number);



    }

    public static boolean generatePassword(List<Character> letters, List<Integer> numbers, List<Character> specials, int special, int length, int number) {
        Random rand = new Random();

        List<Character> ret = new ArrayList<Character>();

        // generating random numbers, letters, and special characters
        for (int i = 0; i < special; i++) {
            int ind = rand.nextInt(31);
            ret.add(specials.get(ind));
        }

        for (int i = 0; i < number; i++) {
            int ind = rand.nextInt(10);
            ret.add((Character) ((char) (numbers.get(ind).intValue())));
        }

        for (int i = 0; i < length - (special + number); i++) {
            int ind = rand.nextInt(26);
            ret.add(letters.get(ind));
        }

        Collections.shuffle(ret); // randomly shuffling the chars in the password

        // building the string for returning it
        StringBuilder retVal = new StringBuilder();
        for (Character result : ret) {
            retVal.append(result);
        }

        System.out.printf("Your password is %s.", retVal.toString());

        return true;
    }

}
