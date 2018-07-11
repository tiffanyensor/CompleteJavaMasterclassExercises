/*
Write a method named hasSameLastDigit with three parameters of type int. 
Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
If one of the numbers is not within the range, the method should return false.
The method should return true if at least two of the numbers share the same rightmost digit;
otherwise, it should return false.
 */

package com.company;

public class LastDigitChecker {

    public static void main(String[] args) {
	    System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
    }

    public static boolean hasSameLastDigit(int n1, int n2, int n3){
        // validate input range
        if(n1<10 || n2<10 || n3<10 || n1>1000 || n2>1000 || n3>1000){
            return false;
        }

        // get last digits
        int lastDigit1 = n1 % 10;
        int lastDigit2 = n2 % 10;
        int lastDigit3 = n3 % 10;

        // compare
        if (lastDigit1 == lastDigit2 || lastDigit2 == lastDigit3 || lastDigit1 == lastDigit3){
            return true;
        }

        return false;
    }
}
