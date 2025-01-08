package com.greatlearning.codingpracticeone;
/*
Write a Java program to swap two variable without using the third variable.
 */

public class swapnumber {
    public static void main(String[] args) {
        int firstVariable,secondVariable;
        firstVariable = 1947;
        secondVariable = 1950;
        System.out.println("Before swapping");
        System.out.println("First Variable is "+firstVariable);
        System.out.println("Second Variable "+secondVariable);

        firstVariable = firstVariable + secondVariable;
        secondVariable = firstVariable - secondVariable;
        firstVariable = firstVariable - secondVariable;

        System.out.println("After swapping");
        System.out.println("First Variable is "+firstVariable);
        System.out.println("Second Variable "+secondVariable);

    }
}
