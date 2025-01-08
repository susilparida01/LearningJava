package com.greatlearning.codingpracticetwo;
/*
Write a Java program to find whether the given number  is positive or negative or zero.
 */
public class VerifyNumber {
    public static void main(String[] args) {
        int input = 0;
        if (input>0){
            System.out.println("The number is positive");
        }
        else if (input<0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is Zero");
        }
    }
}
