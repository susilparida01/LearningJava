package com.greatlearning.codingpracticetwo;
/*
Write a Java program to check whether the given number is a multiple of 6 and 10
 */

public class VerifyMultipleOf6And10 {
    public static void main(String[] args) {
        int number = 77;
        if (number%6 ==0 && number%10==0){
            System.out.println("The number "+number+" is divisible by 6 and 10");
        }
        else{
            System.out.println("The number "+number+ " is not divisible by 6 and 10");
        }
    }
}
