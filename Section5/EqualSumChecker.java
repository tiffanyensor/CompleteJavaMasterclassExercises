/* 
Write a method hasEqualSum with 3 parameters of type int.
The method should return boolean and it needs to return true if sum of first and second parameter is equal to third parameter.
Otherwise return false.
*/


package com.company;

public class EqualSumChecker {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(1,-1,0));
    }

    public static boolean hasEqualSum(int num1, int num2, int num3){
        if (num1 + num2 == num3){
            return true;
        } else {
            return false;
        }
    }


}
