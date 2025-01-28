package com.corejava.topfiftyexamples;

public class Factorial {
	
    // Method to calculate factorial using recursion
    public static int factorialRecursive(int n) {
    	
        if (n <= 1) return 1; // Base case: factorial of 0 or 1 is 1
        return n * factorialRecursive(n - 1); // Recursive call: multiply n with factorial of (n-1)
    }

    // Method to calculate factorial using iteration
    public static int factorialIterative(int n) {
    	
        int result = 1; // Initialize result to 1 (factorial of 0 or 1)
        
        for (int i = 2; i <= n; i++) { // Loop from 2 to n
            result *= i; // Multiply result with the current number i
        }
        return result; // Return the calculated factorial
    }

    public static void main(String[] args) {
    	
        int n = 5; // Input value for which factorial needs to be calculated
        
        // Print factorial calculated using recursion        
        System.out.println("Recursive Factorial: " + factorialRecursive(n));
        
        // Print factorial calculated using iteration
        System.out.println("Iterative Factorial: " + factorialIterative(n));
    }
}
