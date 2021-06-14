/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputCheckerTest {

    @Test
    void validateFirstName() {
        InputChecker test27 = new InputChecker();

        String actual = test27.validateFirstName("John");
        assertEquals(null, actual);
    }

    @Test
    void validateLastName() {
        InputChecker test27 = new InputChecker();

        String actual = test27.validateLastName("Johnson");
        assertEquals(null, actual);
    }

    @Test
    void validateZip() {
        InputChecker test27 = new InputChecker();

        String actual = test27.validateZip("32714");
        assertEquals(null, actual);
    }

    @Test
    void validateEmploysID() {
        InputChecker test27 = new InputChecker();

        String actual = test27.validateEmploysID("AA-1234");
        assertEquals(null, actual);
    }
}