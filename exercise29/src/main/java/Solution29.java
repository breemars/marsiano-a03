/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.Scanner;

public class Solution29 {
    /*
    Handling bad input
    - Try inputting a number from user
    - catch any mismatch or arithmetic exceptions
    - allow the user to input values until a valid one is found
    - print out total years
    */
    public static void main(String[] args) {
        //OUTPUT
        System.out.print("It will take " + getYears() + " years to double your initial investment.");
    }

    //Returns total years
    private static int getYears(){
        Scanner input = new Scanner(System.in);
        int years;
        while(true) {
            try {
                System.out.print("What is the rate of return? ");
                int rate = Integer.parseInt(input.next());
                years = 72 / rate;
                break;
            } catch (Exception e) {
                System.out.println("Sorry. That's not a valid input.");
            }
        }
        return years;
    }

}
