package com.greatlearning.codingpracticetwo;
/*
Write a program to check whether a year is leap year or not
 */

public class LeapYear {
    public static void main(String[] args) {
        int year = 2005; // try year as 2000, 2004 and 2005
        if(year%400==0){
            System.out.println("The year "+year+" is a leap year");
        }
        else if(year%100==0){
            System.out.println("The year "+year+" is not a leap year");
        }
        else if(year%4==0){
            System.out.println("The year "+year+" is a leap year");
        }
        else{
            System.out.println("The year "+year+" is not a leap year");
        }
    }
}
