/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex38;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Exercise38Test {

    Exercise38 test38 = new Exercise38();

    @Test
    void evenNums() {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        ArrayList<Integer> test = new ArrayList<Integer>();

        test.add(1);
        test.add(3);
        test.add(5);

        assertEquals(test, test38.evenNums(nums));

    }
}