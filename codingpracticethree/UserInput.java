package com.greatlearning.codingpracticethree;
/*
Write a Java Program to take input from the user and print the input
 */

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kindly enter your name: ");

        //takes input from users
        String name = sc.nextLine();

        //print the output
        System.out.println("My name is "+name);

        //close scanner
        sc.close();
    }
}
