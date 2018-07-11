/*
Write a method called isPalindrome with one int parameter called number.  
The method needs to return a boolean.  It should return true if the number is a palindrome number
otherwise it should return false.  
 */

package com.company;

public class NumberPalindrome {

    public static void main(String[] args) {
	    System.out.println(isPalindrome(45));
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number){
        if (number<0){
            number = number * -1;
        }
        int reverse = 0;
        int originalNumber=number;
        int lastDigit = 0;
        while (number > 0){
            lastDigit = number%10;
            reverse = reverse*10 + lastDigit;
            number = number/10;
        }
        if (originalNumber == reverse){
            return true;
        } else{
            return false;
        }
    }

}
