package com.greatlearning.codingpracticeone;
/*
Write a Java program to swap two variables using third variable
 */

public class swap2variables {
    public static void main(String[] args) {
        int firstVariable,secondVariable,thirdVariable;
        firstVariable = 1947;
        secondVariable = 1950;
        System.out.println("Before Swapping");
        System.out.println("First Variable is "+firstVariable);
        System.out.println("Second Variable is "+secondVariable);

        thirdVariable = firstVariable;
        firstVariable = secondVariable;
        secondVariable = thirdVariable;

        System.out.println("After Swapping");
        System.out.println("First Variable is "+firstVariable);
        System.out.println("Second Variable is "+secondVariable);

    }
}
