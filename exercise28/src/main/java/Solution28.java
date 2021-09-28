/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.Scanner;

public class Solution28 {
    /*
    Adding numbers
    - Using a for loop, input 5 numbers
    - Add each num to a total sum
    - output total
    */
    public static void main(String[] args) {

        int total = getTotal();
        System.out.print("The total is " + total);

    }

    //Returns total of 5 inputted numbers
    private static int getTotal(){
        int total = 0;
        Scanner input = new Scanner(System.in);
        for(int x = 0; x < 5; x++){
            System.out.print("Enter a number: ");
            total += input.nextInt();
        }
        return total;
    }

}
