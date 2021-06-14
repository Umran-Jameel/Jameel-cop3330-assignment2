/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex26;
import java.util.*;

public class Exercise26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the credit card balance? ");
        String bal = input.nextLine();
        double balance = Double.parseDouble(bal);

        System.out.print("What is the APR on the card (as a percent)? ");
        String APR = input.nextLine();
        double rate = (Double.parseDouble(APR) / 100) / 365;

        System.out.print("What is the monthly payment you can make? ");
        String monthly = input.nextLine();
        double monthlyPayment = Double.parseDouble(monthly);

        PaymentCalculator paymentCalculator = new PaymentCalculator();

        double numMonths = paymentCalculator.calculateMonthsUntilPaidOff(rate, balance, monthlyPayment);

        numMonths = Math.ceil(numMonths);

        System.out.println((int)(numMonths));
    }
}

