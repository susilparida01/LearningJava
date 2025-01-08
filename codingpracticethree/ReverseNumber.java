package com.greatlearning.codingpracticethree;
/*
Write a Java program to reverse a three-digit number using loops.
 */

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three digit number: ");
        int a = sc.nextInt();
        if(a>=100 && a<=999){
            int b=0;
            while (a>0){
                b=(b*10)+a%10;
                a=a/10;
            }
            System.out.println("Reversed number is: "+b);
        }
        else{
            System.out.println("Please enter 3 digit number!");
        }
    }
}
