/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex30;
import java.util.*;

public class Exercise30 {
    public static void main(String[] args) {
        boolean result = generateTable(); // true if successful
    }

    public static boolean generateTable() {
        // rows loop, column loop is nested
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.printf("%5d", i * j);
            }
            System.out.println();

        }
        return true;
    }
}
