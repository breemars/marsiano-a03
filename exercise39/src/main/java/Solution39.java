/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Breanna Marsiano
 */
import java.util.*;

public class Solution39 {
    /*
    Sorting Records
    - Create a list to store the employees
    - Create a map for each employee that stores the employee's data by first, last, position, and date keys
    - Add each of the maps to the list
    - sort list by the last name of each map
    - print out in table format
    */
    public static void main(String[] args) {

        //Create List of Maps
        List<Map<String,String>> list = new ArrayList<>();

        list.add(addEmployeeAsMap("John", "Johnson", "Manager", "2016-12-31"));
        list.add(addEmployeeAsMap("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        list.add(addEmployeeAsMap("Michaela", "Michaelson", "Manager", "2015-12-19"));
        list.add(addEmployeeAsMap("Jake", "Jacobson", "Programmer", ""));
        list.add(addEmployeeAsMap("Jacquelyn", "Jackson", "DBA", ""));
        list.add(addEmployeeAsMap("Sally", "Webber", "Web Developer", "2015-12-18"));

        //Sort the List by the "last" of each Map
        Comparator<Map<String, String>> mapComparator = (m1, m2) -> m1.get("last").compareTo(m2.get("last"));
        list.sort(mapComparator);

        //Print the List
        printList(list);

    }

    //Returns a Map of employee data
    public static Map<String,String> addEmployeeAsMap(String first, String last, String position, String date){
        Map<String,String> map = new HashMap<>();
        map.put("first", first);
        map.put("last", last);
        map.put("position", position);
        map.put("date", date);
        return map;
    }

    //Prints the List of Maps in table format
    private static void printList(List<Map<String, String>> list){
        System.out.printf("%-20s | %-18s | %-10s\n", "Name",  "Position",  "Separation Date");
        System.out.println("------------------------------------------------------------");

        for (Map<String, String> map : list) {
            System.out.printf("%-20s | %-18s | %-10s\n", map.get("first") + " " + map.get("last"), map.get("position"), map.get("date"));
        }
    }
}
