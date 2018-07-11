/*
Create a method called getDurationString with two parameters, first parameter minutes and 2nd parameter seconds.

You should validate that the first parameter minutes is >= 0.

You should validate that the 2nd parameter seconds is >= 0 and <= 59.

The method should return "Invalid value" in the method if either of the above are not true.

If the parameters are valid then calculate how many hours minutes and seconds equal the minutes and seconds passed to
this method and return that value as string in format "XXh YYm ZZs" where XX represents a number of hours, YY the
minutes and ZZ the seconds.

Create a 2nd method of the same name but with only one parameter seconds.

Validate that it is >= 0, and return "Invalid value" if it is not true.

If it is valid, then calculate how many minutes are in the seconds value and then call the other overloaded method
passing the correct minutes and seconds calculated so that it can calculate correctly.

Call both methods to print values to the console.
 */

package com.company;

public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";    // constant, can't be changed

    public static void main(String[] args) {
	    System.out.println(getDurationString(61, 12));
        System.out.println(getDurationString(-48, 47));
        System.out.println(getDurationString(3600));
        System.out.println(getDurationString(4105));
    }

    public static String getDurationString(int min, int sec){
        if(min<0 || sec<0 || sec>59){
            return INVALID_VALUE_MESSAGE;
        }
        int hour = (min/60);
        min = (min%60);

        String strHour = ""+hour;
        String strMin = ""+min;
        String strSec = ""+sec;

        if (hour<10) strHour = "0"+ strHour;
        if (min<10) strMin = "0"+strMin;
        if (sec<10) strSec = "0"+strSec;
        return(strHour + "h "+strMin+"m "+strSec+"s");
    }

    public static String getDurationString(int sec){
        if(sec<0){
            return INVALID_VALUE_MESSAGE;
        }
        int min = sec/60;
        sec = sec%60;
        return(getDurationString(min, sec));
    }


}
