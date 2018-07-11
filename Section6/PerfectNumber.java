/*
What is a perfect number?
A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder and
exclude the perfect number itself.

For example, take the number 6:  Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number, it
is excluded), and the sum of its proper divisors is 1 + 2 + 3 = 6. 
Therefore, 6 is a perfect number (as well as the first perfect number).

Write a method named isPerfectNumber with one parameter of type int named number. 
If number is < 1, the method should return false.
The method must calculate if the number is perfect.
If the number is perfect, the method should return true; otherwise, it should return false.
 */

package com.company;

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number){

        // validate input
        if (number<1){
            return false;
        }

        int sumOfDivisors = 0;

        for (int i = 1; i < number; i++){
            if (number % i == 0){
                sumOfDivisors += i;
            }
        }

        if (sumOfDivisors == number){
            return true;
        } else{
            return false;
        }

    }
}
