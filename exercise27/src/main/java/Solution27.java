/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.Scanner;

public class Solution27 {
    /*
    Validate user input
    - input first and last name, zip code, and ID
    - call validateInput function
    - call other functions to check for validation based on criteria
    - return results to validateInput to print out results
     */

    public static void main(String[] args) {

        //INPUT
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String first = input.next();
        System.out.print("Enter the last name: ");
        String last = input.next();
        System.out.print("Enter the ZIP code: ");
        String zip = input.next();
        System.out.print("Enter the employee ID: ");
        String id = input.next();

        //Validate and Output
        validateInput(first, last, zip, id);

    }

    private static void validateInput(String first, String last, String zip, String id) {
        System.out.print( (validateName(first) ? "The first name must be at least 2 characters long.\n" : "") +
                (validateName(last) ? "The last name must be at least 2 characters long.\n" : "") +
                (validateZIP(zip) ? "The zipcode must be a 5 digit number.\n" : "") +
                (validateID(id) ? "The employee ID must be in the format of AA-1234.\n" : "") +
                (validateName(first) && validateName(last) && validateID(id) && validateZIP(zip) ? "" : "There were no errors found."));
    }

    //Validation of employee ID
    private static boolean validateID(String id) {
        if(id.length() == 7) {
            if (id.toLowerCase().charAt(0) >= 'a' && id.toLowerCase().charAt(0) <= 'z' &&
                    id.toLowerCase().charAt(1) >= 'a' && id.toLowerCase().charAt(1) <= 'z' && id.charAt(2) >= '-') {
                for (int i = 3; i < 6; i++) {
                    char c = id.charAt(i);
                    if (!(c >= '0' && c <= '9'))
                        return true;
                }
                return false;
            }
        }
        return true;
    }

    //Validation of ZIP code
    private static boolean validateZIP(String zip) {
        if(zip.length() == 5) {
            for (int i = 0; i < zip.length(); i++) {
                char c = zip.charAt(i);
                if (!(c >= '0' && c <= '9'))
                    return true;
            }
            return false;
        }
        return true;
    }

    //Validate Name
    private static boolean validateName(String name) {
        return (name.length() < 2);
    }
}
