package com.greatlearning.codingpracticetwo;
/*
Write a Java program to demonstrate a basic calculator having Addition, Subtraction, Multiplication, and Division.
 */

public class Calculator {
    public static void main(String[] args) {
        int a,b,choice;
        System.out.println("1 for addition");
        System.out.println("2 for substraction");
        System.out.println("3 for multiplication");
        System.out.println("4 for division");

        a = 40;
        b = 20;
        choice = 4; // try choice as 1, 2 and 3
        System.out.println("Choice is "+choice);

        switch (choice){
            case 1:
                System.out.println("Addition = "+(a+b));
                break;
            case 2:
                System.out.println("Substraction = "+(a-b));
                break;
            case 3:
                System.out.println("Multiplication = "+(a*b));
                break;
            case 4:
                System.out.println("Division = "+(a/b));
                break;
            default:
                System.out.println("Invalid Choice!");
        }

    }
}
