/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution35 {
    /*
    Picking a winner
    - Create an empty list
    - keep on asking user for names and add them to list
    - when user inputs " ", end the loop
    - generate random number based on length of list
    - print out name using random number, who will be the winner
    */
    public static void main(String[] args) {

        //Creates list based on user input
        List<String> list = getList();

        //Prints winner
        int num = (int)(Math.random() * list.size());
        System.out.println("The winner is... " + list.get(num));
    }

    //Creates list
    private static List<String> getList() {
        List<String> list = new ArrayList<>();

        //Get names
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a name: ");
            String name = input.nextLine();
            if((name.equals(" ")))
                break;
            list.add(name);
        }
        return list;
    }

}
