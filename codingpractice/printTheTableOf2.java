package com.greatlearning.codingpractice;

/*
Program to implement the continue and break functionality
Create a program to print the table of 2. Create an infinite for loop,
use continue if number doesn't come in table of 2,
and break if the loop variable exceeds 20.
 */


public class printTheTableOf2 {
    public static void main(String[] args) {
        int i = 1;
        //infinite for loop
        for (;;i++){
            //continue if no doesn't come in table of 2
            if (i%2 != 0)
                continue;
            //break if no exceeds 20
            else if (i>20)
                break;
            //print loop variable
            else
                System.out.println(i);
        }


    }
}
