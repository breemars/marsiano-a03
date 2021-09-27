/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.Scanner;

public class Solution26 {
    /*
    Months to pay off a credit card
    - input user balance, apr, and monthly payment
    - calculate daily rate
    - create PaymentCalculator object
    - call calculateMonthsUntilPaidOff function in the PaymentCalculator class
    - output result in months
     */

    public static void main(String[] args) {

        //INPUT
        Scanner input = new Scanner(System.in);
        System.out.print("What is your balance? ");
        int balance = input.nextInt();
        System.out.print("What is the APR on the card (as a percent)? ");
        int dailyRate = input.nextInt();
        System.out.print("What is the monthly payment you can make? ");
        int payment = input.nextInt();

        //Create calculator object
        PaymentCalculator credit = new PaymentCalculator(balance, dailyRate, payment);

        //OUTPUT
        System.out.printf("It will take you %.0f months to pay off this card.", credit.calculateMonthsUntilPaidOff());

    }
}
