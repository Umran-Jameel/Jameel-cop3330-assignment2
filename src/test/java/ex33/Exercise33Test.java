/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex33;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class Exercise33Test {

    @Test
    void response() {
        Exercise33 test33 = new Exercise33();

        String[] responses = new String[4];

        responses[0] = "Yes.";
        responses[1] = "No.";
        responses[2] = "Ask again later.";
        responses[3] = "Maybe.";

        String question = "";

        Random rand = new Random();

        int rand_int = rand.nextInt(4);

        assertEquals(responses[rand_int], test33.response(question, responses, rand_int));
    }
}