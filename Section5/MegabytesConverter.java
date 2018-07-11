/*
Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter. 
Then it needs to print a message in the format "XX KB = YY MB and ZZ KB". XX represents the original value kiloBytes.
YY represents the calculated megabytes. ZZ represents the calculated remaining kilobytes.
If the parameter kiloBytes is < 0 then print instead the text "Invalid Value". 
*/

package com.company;

public class Main {

    public static void main(String[] args) {
	    printMegaBytesAndKiloBytes(5765);
	    printMegaBytesAndKiloBytes(-3);
	    printMegaBytesAndKiloBytes(2050);
    }


    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int numMB = kiloBytes / 1024;
            int numKB = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + numMB + " MB and " + numKB + " KB");
        }
    }

}
