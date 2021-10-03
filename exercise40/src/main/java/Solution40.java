/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Breanna Marsiano
 */
import java.util.*;

public class Solution40 {
    /*
    Filtering Records
    - Create a list to store the employees
    - Create a map for each employee that stores the employee's data by first, last, position, and date keys
    - Add each of the maps to the list
    - get a search string from user
    - search through the first and last names for the search string
    - print out results in table format
    */
    public static void main(String[] args) {

        //Create List of Maps
        List<Map<String,String>> list = createList();

        //INPUT - Get Search String
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a search string: ");
        String search = input.next();

        //OUTPUT - Find and print results
        System.out.printf("\nResults:\n%-20s | %-18s | %-10s\n", "Name",  "Position",  "Separation Date");
        System.out.println("------------------------------------------------------------");
        searchEmployees(search, list);

    }

    //Searches for employee
    public static void searchEmployees(String search, List<Map<String, String>> list) {
        for (Map<String, String> map : list) {
            if (search.toLowerCase().equals(map.get("first").toLowerCase().substring(0, search.length())))
                printEmployee(map);
            else if (search.toLowerCase().equals(map.get("last").toLowerCase().substring(0, search.length())))
                printEmployee(map);
        }
    }

    //Prints out employee if one found
    private static void printEmployee(Map<String, String> map) {
        System.out.printf("%-20s | %-18s | %-10s\n", map.get("first") + " " + map.get("last"), map.get("position"), map.get("date"));
    }

    //Creates list of maps
    private static List<Map<String, String>> createList() {
        List<Map<String,String>> list = new ArrayList<>();
        list.add(addEmployeeAsMap("John", "Johnson", "Manager", "2016-12-31"));
        list.add(addEmployeeAsMap("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        list.add(addEmployeeAsMap("Michaela", "Michaelson", "Manager", "2015-12-19"));
        list.add(addEmployeeAsMap("Jake", "Jacobson", "Programmer", ""));
        list.add(addEmployeeAsMap("Jacquelyn", "Jackson", "DBA", ""));
        list.add(addEmployeeAsMap("Sally", "Webber", "Web Developer", "2015-12-18"));
        return list;
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

}
