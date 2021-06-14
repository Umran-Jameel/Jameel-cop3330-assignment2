/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex33;
import java.util.*;

public class Exercise33 {
    public static void main(String[] args) {
        System.out.printf("What is your question?\n> ");

        Scanner in = new Scanner(System.in);

        String question = in.nextLine();

        String[] responses = new String[4];

        responses[0] = "Yes.";
        responses[1] = "No.";
        responses[2] = "Ask again later.";
        responses[3] = "Maybe.";

        Random rand = new Random();

        int rand_int = rand.nextInt(4);

        String result = response(question, responses, rand_int);

        System.out.print(result);
    }

    public static String response(String question, String[] responses, int rand_int) {



        return responses[rand_int];
    }
}
