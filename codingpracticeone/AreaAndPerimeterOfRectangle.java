package com.greatlearning.codingpracticeone;
/*
Write a Java program to find the Area and perimeter of a rectangle whose length and breadth are 1.7m and 2.2m respectively.
*/

public class AreaAndPerimeterOfRectangle {
    public static void main(String[] args) {
        double length,breadth;
        length = 20.0;
        breadth = 34.5;
        System.out.println("Area is "+(length*breadth));
        System.out.println("Permeter is "+(2*(length+breadth)));
    }
}
