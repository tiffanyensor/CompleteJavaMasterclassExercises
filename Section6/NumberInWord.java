/*
Write a method called printNumberInWord.
This method should have one parameter called number which a whole number (type int).  
The method needs to print "ZERO" if the number parameter is passed with the value of 0. 
The method needs to print "ONE" if the number parameter is passed with the value of 1.
 The method needs to print "TWO" if the number parameter is passed with the value of 2.
... and so on up to and including "NINE" if the number parameter is passed with the value of 9.
If the number parameter has any other value than 0 to 9, then the method should print "OTHER".
You can use an if-else statement or a the switch statement to solve this challenge - the choice is yours.  
 */

package com.company;

public class NumberInWord {

    public static void main(String[] args) {
        printNumberInWord(4);
        printNumberInWord(99);
    }

    public static void printNumberInWord(int number){
        switch(number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;

        }
    }


}
