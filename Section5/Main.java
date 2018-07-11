package com.company;

public class Main {

    public static void main(String[] args) {
        area(5.0);
        area(-1);
        area(5.0, 4.0);
        area(-1.0, 4.0);
    }

    public static double area(double radius){
        if (radius < 0){
            //System.out.println("Invalid radius");
            return -1;
        } else{
            double a = Math.PI * Math.pow(radius,2);
            //System.out.println("The are of the circle with radius "+radius+" is "+a);
            return a;
        }
    }

    public static double area(double x, double y){
        if (x<0 || y<0){
            //System.out.println("Invalid side length");
            return -1;
        } else{
            double a = x*y;
            //System.out.println("The area of the rectangle with side lengths "+x+" and "+y+" is "+a);
            return a;
        }
    }


}
