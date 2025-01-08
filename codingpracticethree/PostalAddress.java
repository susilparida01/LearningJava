package com.greatlearning.codingpracticethree;
/*
Write a Java Program to display the postal address by taking the house number, street and pincode as input from the user.
 */

import java.util.Scanner;

public class PostalAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your house number: ");
        //take input from user
        String hNumber = sc.nextLine();

        System.out.println("Please enter street name: ");
        String streetName = sc.nextLine();

        System.out.println("Please enter pin code: ");
        int pincode = sc.nextInt();

        //prints the output
        System.out.println("House number: "+hNumber);
        System.out.println("Street number: "+streetName);
        System.out.println("pincode : "+pincode);

        //close the scanner
        sc.close();
    }
}
