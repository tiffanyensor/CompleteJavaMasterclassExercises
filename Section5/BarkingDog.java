/*
We have a dog that likes to bark.  We need to wake up if the dog is barking at night!
Write a method bark that has 2 parameters.
1st parameter should be of type boolean and be named barking it represents if our dog is currently barking. 
2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has valid range of 0-23.
We have to wake up if the dog is barking before 08:00 am or after 22:00 hours so in that case return true. 
In all other cases return false. If the hourOfDay parameter is less than 0 or greater than 23 return false.
*/


package com.company;

public class BarkingDog {

    public static void main(String[] args) {
        System.out.println(bark(true, 1));
        System.out.println(bark(false, 2));
        System.out.println(bark(true, 8));
        System.out.println(bark(true, -1));
    }

    public static boolean bark(boolean barking, int hourOfDay){
        if (barking == false){
            return false;
        }
        else if ((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay <= 23)){
            return true;
        } else{
            return false;
        }
    }



}
