/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise25Test {

    @Test
    void veryWeak() {
        Exercise25 test25 = new Exercise25();

        int test = test25.passwordValidator("123456789");
        assertEquals(0, test);
    }

    @Test
    void weak() {
        Exercise25 test25 = new Exercise25();

        int test = test25.passwordValidator("abcdef");
        assertEquals(1, test);
    }

    @Test
    void strong() {
        Exercise25 test25 = new Exercise25();

        int test = test25.passwordValidator("abc123xyz");
        assertEquals(2, test);
    }

    @Test
    void veryStrong() {
        Exercise25 test25 = new Exercise25();

        int test = test25.passwordValidator("1337h@xor!");
        assertEquals(3, test);
    }
}