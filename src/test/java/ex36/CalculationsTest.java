/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CalculationsTest {

    Calculations test36 = new Calculations();

    @Test
    void average() {
        ArrayList<Double> arr = new ArrayList<Double>();

        arr.add(100.0);
        arr.add(900.0);
        assertEquals(500, (int)test36.average(arr));
    }

    @Test
    void min() {
        ArrayList<Double> arr = new ArrayList<Double>();

        arr.add(100.0);
        arr.add(900.0);
        assertEquals(100, (int)test36.min(arr));
    }

    @Test
    void max() {
        ArrayList<Double> arr = new ArrayList<Double>();

        arr.add(100.0);
        arr.add(900.0);
        assertEquals(900, (int)test36.max(arr));
    }

    @Test
    void std() {
        ArrayList<Double> arr = new ArrayList<Double>();

        arr.add(100.0);
        arr.add(900.0);
        assertEquals(400, (int)test36.std(arr));
    }
}