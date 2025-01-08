package com.greatlearning.codingpracticeone;
/*
Write a Java program to find whether the given number is even or odd using ternary operator
( Syntax : variable = (condition) ? expression1 : expression2  )
 */

public class EvenOddUsingTernary {
    public static void main(String[] args) {
        int b=23;
        String a;
        a = (b % 2 == 0)?"Even":"Odd";
        System.out.println(b+" is "+a);
    }
}
