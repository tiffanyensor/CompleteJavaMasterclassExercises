package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if (temperature <25){
            return false;
        }
        else if (summer == true && temperature <= 45){
            return true;
        }
        else if (summer == false && temperature <= 35){
            return true;
        } else {
            return false;
        }
    }




}
