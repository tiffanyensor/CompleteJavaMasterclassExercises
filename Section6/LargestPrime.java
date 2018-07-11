/*
Write a method named getLargestPrime with one parameter of type int named number. 
If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
The method should calculate the largest prime of a given number and return it.
 */

package com.company;

public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));

    }

    public static int getLargestPrime(int number){
        if (number < 0){
            return -1;
        }
        int counter = 2;
        int biggestPrime=-1;
        while (counter <= number){
            if (number % counter ==0){
                boolean counterIsPrime=true;
                int c=2;
                while (c<counter){
                    if (counter%c==0){
                        counterIsPrime=false;
                    }
                    c++;
                }
                if (counterIsPrime==true){
                    biggestPrime = counter;
                }
            }
            counter ++;
        }
        return biggestPrime;
    }

}
