/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex26;

public class PaymentCalculator {
    public double calculateMonthsUntilPaidOff(double rate, double balance, double monthlyPayment) {
        double ret = Math.log(1 + ((balance/monthlyPayment) * (1- Math.pow((1 + rate), 30)))) / Math.log(1 + (rate));

        ret *= -(1.0/30.0);

        return ret;

    }
}
