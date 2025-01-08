package com.greatlearning.codingpractice;

public class checkLeapYear {
    public static void main(String[] args) {
        int year = 1300;
        //leap year is perfectly divisible by 400
        if (year % 400 == 0){
            System.out.println("Leap Year");
        }
        //not a leap year if divisible by 100 and not divisible by 400
        else if (year % 100 == 0){
            System.out.println("Not a leap year");
        }
        //leap year if divisible by 4 and not divisible by 100
        else if (year % 4 == 0){
            System.out.println("Leap Year");
        }
        //rest all years are non leap year
        else{
            System.out.println("not a leap year");
        }
    }
}
