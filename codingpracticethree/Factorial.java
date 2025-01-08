package com.greatlearning.codingpracticethree;
/*
Write a Java program to find the factorial of 10.
 */

public class Factorial {
    public static void main(String[] args) {
        int a =1;
        int fact = 1;
        while (a<=10){
            fact = a*fact;
            a++;
        }
        System.out.println("Factorial of 10 is: "+fact);
    }
}
