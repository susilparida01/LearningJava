package com.greatlearning.codingpractice;

public class InvertedPyramidTriangle {
    public static void main(String[] args) {
        // Define the number of rows for the inverted pyramid
        int rows = 5;

        // Outer loop to print rows
        for (int i = rows; i >= 1; i--) {
            // Inner loop for spaces
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" "); // Print spaces before stars
            }

            // Inner loop for stars
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*"); // Print stars
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
