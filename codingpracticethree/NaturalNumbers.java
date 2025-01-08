package com.greatlearning.codingpracticethree;
/*
Write a Java program to find the sum of n natural numbers by taking the value of n from the user.
 */

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        //find the sum
        int sum = 0;
        for (int i = 1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println("Sum of n number is : "+sum);
        //close scanner
        sc.close();

    }
}
