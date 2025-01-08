package com.greatlearning.codingpracticeone;
/*
Write a Java program to find the Area and Perimeter of a circle whose diameter is 14m.(take π value as 3.14)
 */

public class AreaAndPerimeterOfCircle {
    public static void main(String[] args) {
        double diameter,pi;
        diameter = 14;
        pi = 3.14;
        System.out.println("Perimeter of circle is "+ (pi*diameter)+" meter");
        System.out.println("Area of the circle is "+((pi*diameter*diameter)/4)+" square meter");
    }
}
