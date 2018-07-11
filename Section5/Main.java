package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }

    public static boolean hasTeen(int n1, int n2, int n3){
        if ((n1 <= 19 && n1 >= 13) || (n2 <= 19 && n2 >= 13) || (n3 <= 19 && n3 >= 13)){
            return true;
        } else {
            return false;
        }
    }


}
