package com.greatlearning.codingpracticeone;
/*
Write a Java program to convert celsius to Fahrenheit (Fahrenheit = ( Celsius × 1.8 ) + 32)
 */

public class CelesiusToFahrenheit {
    public static void main(String[] args) {
        double Celsius, Fahrenheit;
        Celsius = 20.5;
        Fahrenheit = ((Celsius*1.8)+32);
        System.out.println("Celsius is "+Celsius);
        System.out.println("Fahrenheit is "+Fahrenheit);


    }
}
