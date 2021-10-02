/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution38 {
    /*
    Filter even numbers
    - input string of numbers
    - while there are still chars in the string
    -- remove space at beginning
    -- find a substring of the next number
    -- parse to int and add to int list
    - Use the final int list to create a new list of only evens
    - print out evens
    */
    public static void main(String[] args) {

        //Get string of numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String listString = input.nextLine();

        //Convert to List, then create a new list of just evens
        List<Integer> list = getList(listString);
        List<Integer> evens = filterEvenNumbers(list);

        //Print out evens
        System.out.print("The even numbers are ");
        for (int num : evens)
            System.out.print(num + " ");
    }

    private static List<Integer> getList(String listString) {
        List<Integer> list = new ArrayList<>();
        int x = 0;

        //While there is still chars left in the string
        while (listString.length() > 0) {

            //Remove space at beginning of string
            if (listString.charAt(0) == ' ')
                listString = listString.substring(1);

            else {
                //Find where the number ends
                while (x < listString.length() && listString.charAt(x) != ' ')
                    x++;

                //Create substring of number and parse to integer
                String stringNum = listString.substring(0, x);
                int num = Integer.parseInt(stringNum);
                list.add(num);

                //If there are still chars at the end of the string, create a new substring
                if (x + 1 < listString.length()) {
                    listString = listString.substring(x + 1);
                    x = 0;
                } else { //if not, end
                    break;
                }
            }
        }
        return list;
    }


    //Returns even numbers
    private static List<Integer> filterEvenNumbers(List<Integer> list) {
        List<Integer> evens = new ArrayList<>();
        for (int num : list)
            if (num % 2 == 0)
                evens.add(num);

        return evens;
    }
}