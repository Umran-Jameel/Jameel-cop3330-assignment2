/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise32Test {

    @Test
    void game() {
        Exercise32 test32 = new Exercise32();

        assertEquals(true, test32.game());
    }
}