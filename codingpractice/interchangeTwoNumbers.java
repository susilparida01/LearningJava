package com.greatlearning.codingpractice;

public class interchangeTwoNumbers {
    public static void main(String[] args) {
        //declare variables and assign values
        int num1 = 10;
        int num2 = 12;
        //numbers initially
        System.out.println("Initial value of numbers");
        System.out.println("num1->"+num1);
        System.out.println("num2->"+num2);

        //number interchange
        num1 = num1+num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println();
        System.out.println("Values after interchanging");
        System.out.println("num1->"+num1);
        System.out.println("num2->"+num2);
    }
}
