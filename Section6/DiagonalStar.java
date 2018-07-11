/*
Write a method named printSquareStar with one parameter of type int named number. 
If number is < 5, the method should print "Invalid Value".
The method should print diagonals to generate a rectangular pattern composed of stars (*).
This should be accomplished by using loops (see examples below).

printSquareStar(5); should print the following:
*****
** **
*   * *
** *  *
**  ***

printSquareStar(8); should print the following:
********
  **    **
  * *  * *
  *  **  *
  *  **  *
  * *  * *
  **    **
  ********

The patterns above consist of a number of rows and columns (where number is the number of rows to print).
For each row or column, stars are printed based on four conditions (Read them carefully):
* In the first or last row
* In the first or last column
* When the row number equals the column number
* When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)
*/



package com.company;

public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(2);
        printSquareStar(5);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");

        } else {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if ((i == 1) || (j==1) || (i==j) || (i==number-j+1) || (i==number) || (j==number)) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }

    }

}
