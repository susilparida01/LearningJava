package com.greatlearning.codingpracticetwo;
/*
Write a Java program to find even or odd numbers using Switch case
 */

public class OddOrEvenUsingSwitch {
    public static void main(String[] args) {
        int num = 200;
        switch (num%2){
            case 0:
                System.out.println(+num+": This is a even number");
                break;
            case 1:
                System.out.println(+num+": This is a odd number");
                break;
        }
    }
}
