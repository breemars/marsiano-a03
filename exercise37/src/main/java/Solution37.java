/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.List;
import java.util.Scanner;

public class Solution37 {
    /*
    Password Generator
    - input minimum length, special char count, and number count
    - use a separate class to store methods as it will be more organized to set the char arrays
    -- and call the calculations when in object-format
    - create 3 lists of possible letters, numbers, and special chars
    - while password incomplete:
    -- generate a random number for type of char going to be inserted
    -- generate another random number to pick from that type of list
    -- insert that char into a final char list for the final password
    - return the final password and print
    */
    public static void main(String[] args) {

        //INPUT
        Scanner input = new Scanner(System.in);
        System.out.print("What's the minimum? ");
        int minLength = input.nextInt();
        System.out.print("How many special characters? ");
        int specialCount = input.nextInt();
        System.out.print("How many numbers? ");
        int numCount = input.nextInt();

        //Generate Password
        passwordGenerator generator = new passwordGenerator();
        List<Character> password = generator.getPassword(numCount, specialCount, minLength);

        //OUTPUT
        System.out.print("Your password is: ");
        for(char x: password)
            System.out.print(x);
    }
}
