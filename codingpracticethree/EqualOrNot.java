package com.greatlearning.codingpracticethree;
/*
Write a Java Program to take two numerical inputs from the user and check whether they are equal or not
 */

import java.util.Scanner;

public class EqualOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = sc.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = sc.nextInt();

        //check the numbers are equal or not
        if (firstNumber==secondNumber){
            System.out.println("The two numbers are equal");
        }
        else{
            System.out.println("The two numbers are not equal");
        }
        // close scanner
        sc.close();
    }
}
