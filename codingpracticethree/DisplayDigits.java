package com.greatlearning.codingpracticethree;
/*
Write a Java program to get a three-digit number as input from the user and display the ones,
tens and hundreds digit using loops and modulus operator.
 */

import java.util.Scanner;

public class DisplayDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three digit number: ");
        int a = sc.nextInt();
        if (a>=100 && a<=999){
            int b;
            while (a>0){
                b=a%10;
                a=a/10;
                System.out.println(b);
            }
        }
        else {
            System.out.println("Please enter 3 digit number!");
        }
    }
}
