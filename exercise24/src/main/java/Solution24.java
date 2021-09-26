/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.Arrays;
import java.util.Scanner;

public class Solution24 {
    /*
    Anagram Checker
    - input two strings
    - create an array to keep track of letters
    - convert the strings to char arrays
    - sort the char arrays alphabetically
    - if they are equal, the strings are anagrams
    - print out result to user
     */

    public static void main(String[] args) {

        //INPUT
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.println("Enter the first string: ");
        String phraseOne = input.nextLine();
        System.out.println("Enter the second string: ");
        String phraseTwo = input.nextLine();

        //OUTPUT
        System.out.print("\"" + phraseOne + "\" and \"" + phraseTwo + "\" are" + ((isAnagram(phraseOne, phraseTwo)) ? " " : " NOT ") + "anagrams");

    }

    private static boolean isAnagram(String phraseOne, String phraseTwo) {

        //Convert to char arrays
        char[] firstSet = phraseOne.toUpperCase().toCharArray();
        char[] secondSet = phraseTwo.toUpperCase().toCharArray();

        //Sort the arrays
        Arrays.sort(firstSet);
        Arrays.sort(secondSet);

        return Arrays.equals(firstSet, secondSet);
    }

}
