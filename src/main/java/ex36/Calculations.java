/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex36;
import java.util.*;

public class Calculations {
    public static double average(ArrayList<Double> arr) {
        double avg = 0;
        double sum = 0;

        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        avg = sum / arr.size();

        return avg;

    }

    public static double min(ArrayList<Double> arr) {
        double min = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }
        return min;
    }

    public static double max(ArrayList<Double> arr) {
        double max = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        return max;
    }

    public static double std(ArrayList<Double> arr) {
        double avg = average(arr);
        double standardDeviation = 0;

        for (int i = 0; i < arr.size(); i++) {
            standardDeviation += Math.pow(arr.get(i) - avg, 2);
        }

        return Math.sqrt(standardDeviation / arr.size());
    }

}
