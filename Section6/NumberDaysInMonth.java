/*
Write a method isLeapYear with a parameter of type int named year. 
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false. 
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false. 
A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.

Write another method getDaysInMonth with two parameters month and year. 
Both of type int.  If parameter month is < 1 or > 12 return -1. 
If parameter year is < 1 or > 9999 then return -1.  This method needs to return the number of days in the month.
Be careful about leap years they have 29 days in month 2 (February).

 */

package com.company;

public class NumberDaysInMonth {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1,2020));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,2018));
        System.out.println(getDaysInMonth(-1,2020));
        System.out.println(getDaysInMonth(1,-2020));

    }

    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999){
            return false;
        } else if (year % 400 == 0){
            return true;
        } else if(year%4 == 0 && year % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year){
        if (month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }
        switch(month) {
            case 1:
                return 31;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
        }
        return -1;

    }

}
