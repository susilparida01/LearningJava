package com.greatlearning.codingpractice;

public class codingChallengeTwo {

    public static void main(String[] args) {
        //declare a variable and assign a number
        int no = 5;

        //use modulus operartor (%) and ternary operator and store the result in a variable
        String result = (no % 2 == 0)? "even":"odd";

        //display the variable
        System.out.println(result);
    }
}
