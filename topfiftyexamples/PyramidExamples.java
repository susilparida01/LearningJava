package com.corejava.topfiftyexamples;

public class PyramidExamples {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        // Example 1: Simple Pyramid
        System.out.println("Simple Pyramid:");
        for (int i = 1; i <= n; i++) { // Loop for rows
            for (int j = 1; j <= i; j++) { // Loop for columns in each row
                System.out.print("* "); // Print asterisk
            }
            System.out.println(); // Move to the next line after each row
        }

        // Example 2: Inverted Pyramid
        System.out.println("\nInverted Pyramid:");
        for (int i = n; i >= 1; i--) { // Loop for rows
            for (int j = 1; j <= i; j++) { // Loop for columns in each row
                System.out.print("* "); // Print asterisk
            }
            System.out.println(); // Move to the next line after each row
        }

        // Example 3: Right-Aligned Pyramid
        System.out.println("\nRight-Aligned Pyramid:");
        for (int i = 1; i <= n; i++) { // Loop for rows
            for (int j = 1; j <= n - i; j++) { // Loop for spaces
                System.out.print("  "); // Print space
            }
            for (int j = 1; j <= i; j++) { // Loop for columns
                System.out.print("* "); // Print asterisk
            }
            System.out.println(); // Move to the next line after each row
        }

        // Example 4: Full Pyramid
        System.out.println("\nFull Pyramid:");
        for (int i = 1; i <= n; i++) { // Loop for rows
            for (int j = 1; j <= n - i; j++) { // Loop for spaces
                System.out.print(" "); // Print space
            }
            for (int j = 1; j <= 2 * i - 1; j++) { // Loop for columns
                System.out.print("*"); // Print asterisk
            }
            System.out.println(); // Move to the next line after each row
        }

        // Example 5: Number Pyramid
        System.out.println("\nNumber Pyramid:");
        for (int i = 1; i <= n; i++) { // Loop for rows
            for (int j = 1; j <= i; j++) { // Loop for columns in each row
                System.out.print(j + " "); // Print current column number
            }
            System.out.println(); // Move to the next line after each row
        }
        
        // Example 6: Spaced Pyramid
        System.out.println("\nSpaced Pyramid:");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Example 7: Diamond Pyramid
        System.out.println("\nDiamond Pyramid:");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }             

    }
}
