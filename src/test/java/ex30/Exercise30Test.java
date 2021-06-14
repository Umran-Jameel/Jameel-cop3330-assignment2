/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class Exercise30Test {

    @Test
    void generateTable() {
        Exercise30 test30 = new Exercise30();

        boolean result = test30.generateTable();
        assertEquals(true, result);
    }
}