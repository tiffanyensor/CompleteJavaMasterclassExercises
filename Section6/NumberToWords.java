/*
Write a method called numberToWords with one int parameter named number.  
The method needs to print out the passed number using words for the digits.  
If the number is negative then print "Invalid Value".  
To print the number in words use the following steps

1. Extract last digit of given number using the remainder operator. 
2. Switch the value of digit found above. There are 10 possible values of digits those being 0, 1, 2, 3, 4, 5, 6, 7, 8 ,9. Print the corresponding word for each digit.  e.g.  print "Zero" if digit is 0, "One" if digit is 1, and so on.
3. Remove the last digit from the number.
4. Repeat step 2 through 4 until the number is 0.

The logic above is correct but the words will be printed in reverse order.
For example if the number is 234 the logic above will produce the output "Four Three Two" instead of "Two Three Four".
To overcome this problem write a second method called reverse.

The reverse method has one int parameter and returns the reversed number (int).
For example if the number passed is 234 then the reversed number returned would be 432.
  The reverse method should also reverse negative numbers.
Use the reverse method in the numberToWords method then print the words in the correct order.
  For the number 100 the reverse number is 001.
The logic above for the method numberToWords will print "One" but that is incorrect it should print "One Zero Zero".
To solve the problem with leading zeroes write a third method getDigitCount.  

The getDigitCount method has one int parameter number and returns the count of digits in that number.
If the number is negative then return -1 to indicate an invalid value.
  If number has the value of 100 then the method getDigitCount needs to return 3 since the number 100 has 3 digits 1, 0, 0.
 */



package com.company;

public class NumberToWords {

    public static void main(String[] args) {
        System.out.println("Test getDigitCount()");
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(1));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

        System.out.println("Test reverse()");
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));

        System.out.println("Test numberToWords()");
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
        numberToWords(1450);
    }

    public static void numberToWords(int number){

        if (number < 0)
            System.out.println("Invalid Value");

        // reverse number and compare nuber of digits
        int digitsBeforeRev = getDigitCount(number);
        number = reverse(number);
        int digitsAfterRev = getDigitCount(number);
        int trailingZeros = digitsBeforeRev - digitsAfterRev;

        int lastDigit=0;

        while (number>0){
            lastDigit = number % 10;
            number = number / 10;

            switch(lastDigit){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Not a number");
            }

        }

        // trailing zeros
        for (int i=0; i<trailingZeros; i++){
            System.out.println("Zero");
        }

    }

    public static int reverse(int number){

        // convert number to positive
        boolean isNegative = false;
        if (number < 0){
            isNegative = true;
            number = number * -1;
        }

        int lastDigit = 0;
        int reversedNumber = 0;

        while (number>0){
            lastDigit = number % 10;
            number = number/10;
            reversedNumber = reversedNumber*10 + lastDigit;
        }

        // convert back to negative if necessary
        if (isNegative == true){
            return reversedNumber*-1;
        } else{
            return reversedNumber;
        }
    }

    public static int getDigitCount(int number){

        if (number < 0){
            return -1;
        }

        if (number == 0){
            return 1;
        }

        int digitCount = 0;

        while (number>0){
            number = number/10;
            digitCount += 1;
        }

        return digitCount;
    }
}
