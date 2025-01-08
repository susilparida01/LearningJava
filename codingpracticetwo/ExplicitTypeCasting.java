package com.greatlearning.codingpracticetwo;
/*
Write a java program to demonstrate explicit typecasting
 */

public class ExplicitTypeCasting {
    public static void main(String[] args) {
        double a = 7.58473837383838;
        float b = (float) a;
        int c = (int) a;
        System.out.println("Before type conversion "+a);
        System.out.println("After type conversion to float "+b);
        System.out.println("After type conversion to int "+c);
    }
}
