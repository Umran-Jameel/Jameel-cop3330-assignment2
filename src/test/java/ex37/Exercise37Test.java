/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex37;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Exercise37Test {

    Exercise37 test37 = new Exercise37();

    @Test
    void generatePassword() {
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

        int special = 2;
        int length = 8;
        int number = 2;

        assertEquals(true, test37.generatePassword(letters, numbers, specials, special, length, number));
    }
}