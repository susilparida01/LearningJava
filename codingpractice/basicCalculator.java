package com.greatlearning.codingpractice;

/*
Description:
Write a program in java to implement a basic calculator using switch case statement
Accept two no as user input and print the result based on operation.
Display list of options
        1 → addition
        2 → subtraction
        3 → multiplication
        4 → division
Perform division only if the second number is not equal to 0. If the second number is 0 print “Cannot be divided” on console.
 */

import java.util.Scanner;

public class basicCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1");
        int number1 = sc.nextInt();
        System.out.println("Enter number 2");
        int number2 = sc.nextInt();
        System.out.println("Enter a option from the following: ");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.division");
        int option = sc.nextInt();

        switch (option){
            case 1:
                System.out.println(number1 + number2);
                break;
            case 2:
                System.out.println(number1 - number2);
                break;
            case 3:
                System.out.println(number1 * number2);
                break;
            case 4:
                if (number2 == 0){
                    System.out.println("Can not be divided");
                } else {
                    System.out.println(number1/number2);
                }
                break;

        }


    }
}
