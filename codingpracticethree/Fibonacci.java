package com.greatlearning.codingpracticethree;
/*
7.	Write a Java program to print the first 15 Fibonacci numbers
( the Fibonacci sequence is a sequence in which each number is the sum of the two preceding ones.
Example 0,1,1,2,3,5,8,13,21,34)
 */

public class Fibonacci {
    public static void main(String[] args) {
        int a,b,c,i;
        a = -1;
        c = 1;
        i = 1;
        while (i<=10){
            b = a+c;
            System.out.println(b);
            a=c;
            c=b;
            i++;
        }
    }
}
