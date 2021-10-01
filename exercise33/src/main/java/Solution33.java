/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution33 {
    /*
    Magic 8 Ball
    - prompt the user for a question
    - generate a random number between 1-4
    - store possible responses in a list
    - display the answer based on the number
    */
    public static void main(String[] args) {

        //Gets user's question
        Scanner input = new Scanner(System.in);
        System.out.println("What's your question? ");
        input.nextLine();

        //Prints random response
        System.out.print(getNumber());
    }

    //Returns a random response
    private static String getNumber() {
        List<String> list = new ArrayList<>();
        list.add("Yes");
        list.add("No");
        list.add("Maybe");
        list.add("Ask again later");

        int num = (int)(Math.random() * 4) + 1;
        return switch(num){
            case 1 -> list.get(0);
            case 2 -> list.get(1);
            case 3 -> list.get(2);
            case 4 -> list.get(3);
            default -> "";
        };
    }
}
