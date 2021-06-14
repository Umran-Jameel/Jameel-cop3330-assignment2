/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff() {
        PaymentCalculator test26 = new PaymentCalculator();


        double test = test26.calculateMonthsUntilPaidOff(0.12/365, 5000.0, 100.0);
        test = Math.ceil(test);
        int value = (int)test;
        assertEquals(70, value);
    }
}