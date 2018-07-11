/*
Write a method printYearsAndDays with parameter of type long named minutes.
The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
If parameter is less than 0, print text "Invalid Value".
Otherwise if parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".
XX represents the original value minutes. YY represents the calculated years. ZZ represents the calculated days.
*/


package com.company;

public class MinutesToYearsAndDays {

    public static void main(String[] args) {
        printYearsAndDays(-4);
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }


    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        } else {
            long minPerYear = 60*24*365;
            long minPerDay = 60*24;
            long years = minutes/minPerYear;
            long updatedMinutes = minutes % minPerYear;
            long days = updatedMinutes/minPerDay;
            System.out.println(minutes+" min = "+years+" y and "+days+ " d");
        }
    }



}
