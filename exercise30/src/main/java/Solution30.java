/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Breanna Marsiano
 */

public class Solution30 {
    /*
    Multiplication Table
    - Create a function that will print out a multiplication table using printf for spacing
    - Call the function with 1 and 12
    */
    public static void main(String[] args) {
        printTable(1, 12);
    }

    //Prints multiplication table
    private static void printTable(int a, int b){
        for(int x = a; x <= b; x++) {
            for (int y = a; y <= b; y++)
                System.out.printf("%4d ", x * y);
            System.out.print("\n");
        }
    }
}
