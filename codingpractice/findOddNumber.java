package com.greatlearning.codingpractice;

import java.util.ArrayList;

public class OddNumberFinder {
    public static void main(String[] args) {
        // Define the range
        int start = 1;  // Starting number in the range
        int end = 20;   // Ending number in the range

        // Create an ArrayList to store the odd numbers
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        // Iterate through the range and find odd numbers
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                oddNumbers.add(i);
            }
        }

        // Output the ArrayList of odd numbers
        System.out.println("Odd numbers in the range from " + start + " to " + end + ": " + oddNumbers);
    }
}
