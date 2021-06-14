/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex35;

import ex34.Exercise34;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class Exercise35Test {

    @Test
    void getWinner() {

        ArrayList<String> arr = new ArrayList<String>();

        arr.add("Homer");
        arr.add("Marge");
        arr.add("Bart");
        arr.add("Lisa");
        arr.add("Maggie");
        arr.add("Moe");

        Exercise35 test35 = new Exercise35();

        Random rand = new Random();

        int rand_int = rand.nextInt(6);

        assertEquals(arr.get(rand_int).toString(), test35.getWinner(arr, rand_int));
    }
}