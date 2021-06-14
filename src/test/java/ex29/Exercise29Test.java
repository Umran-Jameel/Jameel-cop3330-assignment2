/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise29Test {

    @Test
    void years() {
        double rate = 2;

        Exercise29 test29 = new Exercise29();

        double actual = test29.years(rate);
        assertEquals(36, (int)actual);
    }
}