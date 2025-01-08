package com.greatlearning.codingpractice;

import java.util.Scanner;

public class inputOutputExample {

    public static void main(String[] args) {

        //declare variables and assign values
        int num = 1;

        //declare variables and assign values
        int num1;
        float num2;
        char character;
        boolean bool;
        String str;
        double num3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter int value ");
        num1 = sc.nextInt();

        System.out.println("Enter float value ");
        num2 = sc.nextFloat();

        System.out.println("Enter string value ");
        str = sc.next();

        System.out.println("Enter double value");
        num3 = sc.nextDouble();

        System.out.println("Enter boolean value");
        bool = sc.nextBoolean();

        System.out.println("Enter character value");
        character = sc.next().charAt(0);

        System.out.println("int -> "+num1);
        System.out.println("Float-> "+num2);
        System.out.println("Char -> "+character);
        System.out.println("boolean ->"+bool);
        System.out.println("String -> "+str);
        System.out.println("Double -> "+num3);


    }

}
