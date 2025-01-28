package com.corejava.topfiftyexamples;

public class FibonacciSeries {
    // Generate Fibonacci series using recursion
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n; // Base cases: Fibonacci(0) = 0, Fibonacci(1) = 1
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2); // Recursive formula
    }
    

    // Generate Fibonacci series using iteration
    public static void fibonacciIterative(int n) {
        int a = 0, b = 1; // Starting values of the Fibonacci series
        System.out.print("Fibonacci Series: " + a + " " + b); // Print first two values

        for (int i = 2; i < n; i++) { // Loop from the 3rd number onward
            int c = a + b; // Next number in the series
            System.out.print(" " + c); // Print the number
            a = b; // Update 'a' to the previous 'b'
            b = c; // Update 'b' to the current number
        }
        System.out.println(); // Move to the next line after the series
    }

    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci terms to generate

        // Iterative approach
        fibonacciIterative(n);

        // Recursive approach
        System.out.print("Fibonacci Series (Recursive): ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " "); // Print each term using recursion
        }
        System.out.println(); // Move to the next line after the series
    }
}
