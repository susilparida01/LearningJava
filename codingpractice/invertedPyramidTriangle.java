package com.greatlearning.codingpractice;
/*
To print an inverted pyramid triangle pattern in Java, you can use nested loops. 
The outer loop will handle the rows, and the inner loop will print the spaces and stars for each row
*/

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

/*
Explanation:
1. rows = 5: You can modify this value to change the number of rows in the pyramid.
2. Outer loop: This loop runs from i = rows to i = 1, printing each row of the pyramid.
3. Inner loop for spaces: The number of spaces decreases as the number of stars increases. For row i, the number of spaces is rows - i.
4. Inner loop for stars: The number of stars printed for each row is (2 * i - 1).
5. System.out.println(): This moves the output to the next line after each row is printed.
*/
