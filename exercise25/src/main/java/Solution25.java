/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.Scanner;

public class Solution25{
    /*
    Password Strength
    - input a password
    - call passwordValidator to count how many numbers, letters, and chars
    - return an int of the strength of password
    - use passwordResult to convert int to words
    - print out result to user
     */

    public static void main(String[] args) {

        //INPUT
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = input.next();

        //OUTPUT
        System.out.print("The password '" + password + "' has a" + passwordResult(passwordValidator(password)) + " password strength");
    }

    private static int passwordValidator(String password) {
        int numCount = 0, letCount = 0, specialCount = 0;

        //Convert to char array for parsing
        char[] firstSet = password.toUpperCase().toCharArray();

        //Check how many numbers, letters, and special characters
        for(char z : firstSet){
            if(z >= '0' & z <= '9')
                numCount++;
            else if((z >= 'A' && z <= 'Z') || (z >= 'a' && z <= 'z'))
                letCount++;
            else if(z >= '!' & z <= '~')
                specialCount++;
        }

        //Return strength of password
        if(firstSet.length < 8 && letCount == 0 && specialCount == 0)
            return 1; //very weak
        else if(firstSet.length < 8 && numCount == 0 && specialCount == 0)
            return 2; //weak
        else if(firstSet.length >= 8 && numCount >= 1 && letCount >= 2)
            return 3; //strong
        else if(firstSet.length >= 8 && numCount >= 1 && letCount >= 1 && specialCount >= 1)
            return 4; //very strong
        else
            return 0; //unknown

    }

    private static String passwordResult(int result){
        return switch (result) {
            case 1 -> " very weak";
            case 2 -> " weak";
            case 3 -> " strong";
            case 4 -> " very strong";
            default -> "n unknown";
        };
    }

}
