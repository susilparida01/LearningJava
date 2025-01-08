package com.greatlearning.codingpracticeone;

/*
Write a Java program to display your name, age, date of birth, educational qualification, mobile number,height and weight using variables
 */

public class displayyourinfo {
    public static void main(String[] args) {
        String name,educationalQualification,mobileNumber,dob;
        int age;
        double height, weight;
        name = "Susil";
        educationalQualification = "BTech";
        mobileNumber = "9632220778";
        dob = "7th July 1978";
        age = 45;
        height = 165.8;
        weight = 74.5;
        
        System.out.println("Name is "+name);
        System.out.println("Education is "+educationalQualification);
        System.out.println("Mobile number is "+mobileNumber);
        System.out.println("DOB is "+dob);
        System.out.println("Age is "+age);
        System.out.println("Height in centimeter is "+height);
        System.out.println("Weight in Kg is "+weight);
        
    }
}
