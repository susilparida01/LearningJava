package com.greatlearning.codingpracticetwo;
/*
Write a Java program to print the maximum of three numbers using if else.
 */

public class MaxOfThreeNumber {
    public static void main(String[] args) {
        int num1 = 34;
        int num2 = 56;
        int num3 = 54;
        if (num1>num2 && num1>num3){
            System.out.println("The Max number is "+num1);
        }
        else if(num1<num2 && num3<num2){
            System.out.println("The Max number is "+num2);
        }
        else{
            System.out.println("The max number is "+num3);
        }
    }
}
