/*
Write a method named hasSharedDigit with two parameters of type int. 
Each number should be within the range of 10 (inclusive) - 99 (inclusive).
If one of the numbers is not within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
otherwise, the method should return false.
 */

package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
        System.out.println(hasSharedDigit(12,43));
    }

    public static boolean hasSharedDigit(int n1, int n2){
        // validate input
        if (n1 < 10 || n2 < 10 || n1>99 || n2>99){
            return false;
        }

        // convert to strings
        String str1 = Integer.toString(n1);
        String str2 = Integer.toString(n2);

        // get lengths
        int len1 = str1.length();
        int len2 = str2.length();

        // compare digits
        for (int i=0; i < len1; i++){
            for (int j=0; j<len2; j++){
                if (str1.charAt(i) == str2.charAt(j)){
                 return true;
                }
            }
        }
        return false;

    }
}
