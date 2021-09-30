/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.Scanner;

public class Solution31 {
    /*
    Heart Rates
    - Ask user for age and resting pulse
    - Call function to print out table of intensities and rates using a loop and incrementing by 5
    - use formula TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
    */
    public static void main(String[] args) {
        //INPUT
        Scanner input = new Scanner(System.in);
        System.out.print("What is your resting pulse? ");
        int restRate = input.nextInt();
        System.out.print("What is your age? ");
        int age = input.nextInt();

        printTable(restRate, age);
    }

    //OUTPUT - Prints Intensities and Rates
    private static void printTable(int restRate, int age){
        System.out.println("\nResting Pulse: " + restRate + "     Age: " + age);
        System.out.println("Intensity |  Rate\n----------|-----------");
        for(int i = 55; i <= 95; i += 5) {
            double targetHeartRate = (((220 - age) - restRate) * (i/100.0)) + restRate;
            System.out.printf("%4d%%     |  %4.0f bpm %n", i, targetHeartRate);
        }
    }
}
