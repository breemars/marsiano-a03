/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution36 {
    /*
    Statistics
    - input numbers until user enters "done"
    - use try and catch to filter invalid info
    - store numbers in arraylist
    - compute av, max, min, and standard dev in separate functions
    - output results
    */
    public static void main(String[] args) {

        //INPUT - Creates list based on user input
        List<Double> list = getList();

        //OUTPUT - Calculate and print results
        System.out.printf("The average is %.1f", average(list));
        System.out.printf("\nThe minimum is %.0f", min(list));
        System.out.printf("\nThe maximum is %.0f", max(list));
        System.out.printf("\nThe standard deviation is %.2f", std(list, average(list)));
    }

    //Returns standard deviation
    private static double std(List<Double> list, double average) {
        double standardDeviation = 0.0;

        for(double num: list)
            standardDeviation += Math.pow(num - average, 2);

        return Math.sqrt(standardDeviation/list.size());
    }

    //Returns maximum
    private static double max(List<Double> list) {
        double maximum = list.get(0);
        for(double num : list)
            if(num > maximum)
                maximum = num;
        return maximum;
    }

    //Returns minimum
    private static double min(List<Double> list) {
        double minimum = list.get(0);
        for(double num : list)
            if(num < minimum)
                minimum = num;
        return minimum;
    }

    //Returns average
    private static double average(List<Double> list) {
        double total = 0;
        for(double num : list)
            total += num;
        return total/list.size();
    }

    //Creates list
    private static List<Double> getList() {
        List<Double> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        //Get numbers
        while(true){
            System.out.print("Enter a number: ");
            String in = input.next();
            if((in.equals("done")))
                break;

            try{
                double num = Double.parseDouble(in);
                list.add(num);
            }catch(Exception e){
                System.out.print("Invalid Input. Enter a number or \"done\" ");
            }
        }
        return list;
    }

}
