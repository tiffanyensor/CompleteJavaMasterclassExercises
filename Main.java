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
