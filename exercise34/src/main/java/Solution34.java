/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution34 {
    /*
    Employee List Removal
    - Create and print list of employees
    - prompt user for employee to delete
    - remove employee from list
    - reprint out the list
    */
    public static void main(String[] args) {

        //Create and print list
        List<String> list = getList();
        printList(list);

        //Get employee to remove
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter an employee name to remove: ");
        String remove = input.nextLine();

        //Remove and reprint
        list.remove(remove);
        printList(list);
    }

    //Prints list
    private static void printList(List<String> list) {
        System.out.println("\nThere are " + list.size() + " employees: ");
        for(String employee : list)
            System.out.println(employee);
    }

    //Creates list
    private static List<String> getList() {
        List<String> list = new ArrayList<>();
        list.add("Captain America");
        list.add("Iron Man");
        list.add("Black Widow");
        list.add("Hawkeye");
        list.add("Thor of Asgard");
        list.add("The Hulk");
        return list;
    }

}
