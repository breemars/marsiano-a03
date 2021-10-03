/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.Scanner;

public class Solution32 {
    /*
    Guess the number
    - Ask the user for level of difficulty
    - generate a random number based on difficulty
    - continue to take in user's guesses until they get it correct
    - use a try catch block to get non-numerical values and count as incorrect
    - tell them if their guess is too high or low
    - ask the user if they would like to play again
    -- if yes, repeat all previous steps
    -- if no, exit
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            //Calls the game then outputs results when won
            System.out.println("You got it in " + playGame() + " guesses!");

            //Asks user if they would like to continue
            System.out.print("Do you wish to play again (Y/N)? ");
            String again = input.next();
            if(!(again.equalsIgnoreCase("y")))
                break;
        }
    }

    //Begins the game
    private static int playGame(){
        //INPUT level
        System.out.println("\nLet's play Guess the Number! ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        int level = input.nextInt();

        //Generate Random Number
        int num = getNumber(level);

        //INPUT Guesses
        int count = 0;
        while(true) {
            try {
                System.out.print("Your Guess: ");
                int guess = Integer.parseInt(input.next());
                count++;

                if (guess < num)
                    System.out.print("Too low. ");
                else if (guess > num)
                    System.out.print("Too high. ");
                else
                    return count;

            } catch (Exception e) {
                count++;
                System.out.println("Invalid input. Guesses must be numeric integers.");

            }
        }
    }

    //Returns random number based on level
    public static int getNumber(int level) {
        return switch(level){
            case 1 -> (int)(Math.random() * 10) + 1;
            case 2 -> (int)(Math.random() * 100) + 1;
            case 3 -> (int)(Math.random() * 1000) + 1;
            default -> throw new IllegalStateException("Invalid value: " + level);
        };
    }
}
