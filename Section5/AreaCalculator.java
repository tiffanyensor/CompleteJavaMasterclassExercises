/*
Write a method named area with one double parameter named radius.
The method needs to return a double value that represents the area of a circle.
If the parameter radius is negative then return -1.0 to represent an invalid value. 
Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
The method needs to return an area of a rectangle. 
If either or both parameters is/are negative return -1.0 to indicate an invalid value.
*/

package com.company;

public class AreaCalculator {

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
