/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise34Test {

    @Test
    void removeName() {
        Exercise34 test34 = new Exercise34();
        String[] arr = new String[5];

        arr[0] = "John Smith";
        arr[1] = "Jackie Jackson";
        arr[2] = "Chris Jones";
        arr[3] = "Amanda Cullen";
        arr[4] = "Jeremy Goodwin";

        boolean test = test34.removeName(arr, "John Smith");

        assertEquals(true, test);
    }
}