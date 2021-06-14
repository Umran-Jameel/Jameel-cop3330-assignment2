/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise28Test {

    @Test
    void addNumbers() {
        Exercise28 test28 = new Exercise28();

        double[] values = {1, 2, 3, 4, 5};

        double sum = test28.addNumbers(values);
        assertEquals(15.0, sum);
    }
}