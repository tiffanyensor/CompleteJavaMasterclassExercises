package com.company;

public class Main {

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
