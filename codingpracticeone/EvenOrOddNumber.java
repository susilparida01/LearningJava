package com.greatlearning.codingpracticeone;
/*
Write a Java program to find whether the given number is even or odd using if- else.
 */

public class EvenOrOddNumber {
    public static void main(String[] args) {
        int number = 23;
        if (number%2 == 0){
            System.out.println(+number+" is even");
        }
        else{
            System.out.println(+number+" is odd");
        }
    }
}
