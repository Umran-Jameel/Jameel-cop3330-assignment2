/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise24Test {

    @Test
    void isAnagram() {
        Exercise24 test24 = new Exercise24();
        assertEquals(true, Exercise24.isAnagram("note", "tone"));
    }

    @Test
    void isNotAnagram() {
        Exercise24 test24 = new Exercise24();
        assertEquals(false, Exercise24.isAnagram("vebvondw", "vnjoaiwn"));
    }
}