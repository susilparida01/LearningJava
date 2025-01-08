package com.greatlearning.codingpracticeone;
/*
Write a java program to swap three variable without using the forth variable
 */

public class SwapThreeVariables {
    public static void main(String[] args) {
        int firstVariable, secondVariable, thirdVariable;
        firstVariable = 19;
        secondVariable = 20;
        thirdVariable = 21;

        System.out.println("Before Swapping");
        System.out.println("First variable is "+firstVariable);
        System.out.println("Second variable is "+secondVariable);
        System.out.println("Third variable is "+thirdVariable);

        firstVariable = firstVariable+secondVariable+thirdVariable;
        secondVariable = firstVariable - (secondVariable+thirdVariable);
        thirdVariable = firstVariable - (secondVariable+thirdVariable);
        firstVariable = firstVariable - (secondVariable+thirdVariable);

        System.out.println("After Swapping");
        System.out.println("First variable is "+firstVariable);
        System.out.println("Second variable is "+secondVariable);
        System.out.println("Third variable is "+thirdVariable);
    }
}
