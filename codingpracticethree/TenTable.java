package com.greatlearning.codingpracticethree;
/*
Write a Java program to display 10 tables (until 10 X12 = 120) using for loop
 */

public class TenTable {
    public static void main(String[] args) {
        int i = 1;
        while (i<=12){
            System.out.println("10X"+i+"="+(10*i));
            i++;
        }
    }
}
