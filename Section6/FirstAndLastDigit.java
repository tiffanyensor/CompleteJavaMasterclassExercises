/*
Write a method named sumFirstAndLastDigit with one parameter of type int called number.  
The method needs to find the first and last digit of the parameter number passed to the method,
using a loop and return the sum of the first and last digit of that number.
  If the number is negative then the method needs to return -1 to indicate an invalid value.
 */

package com.company;

public class FirstAndLastDigit {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }


    public static int sumFirstAndLastDigit(int number) {
        if (number < 0){
            return -1;
        }

        // find the last digit
        int lastDigit = 0;
        if (number < 10) {
            lastDigit = number;
        } else {
            lastDigit = number % 10;
        }

        // find the first digit
        int firstDigit = 0;
        if (number < 10){
            firstDigit = number;
        } else{
            while (number > 0){
                firstDigit = number;
                number = number/10;
            }
        }

        // sum digits
        int sum = firstDigit + lastDigit;
        return sum;
    }
}
