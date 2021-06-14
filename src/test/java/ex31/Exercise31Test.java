/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise31Test {

    @Test
    void calculations() {
        Exercise31 test31 = new Exercise31();

        double[] arr = {65, 22};
        double[] expected = {138, 144, 151, 158, 164, 171, 178, 184, 191};

        double[] result = test31.calculations(arr);
        assertEquals(expected, result);
    }
}