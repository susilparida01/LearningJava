package com.corejava.topfiftyexamples;

public class FibonacciDP {
	
	// Method to calculate the nth Fibonacci number using Dynamic programming
	public static int fibonacci(int n) {
		
		//Base case: if n is 0 or 1, return n itself
		if (n <= 1) return n;
		
		// Create an array to store Fibonacci numbers up to the nth position
		int[]	fib = new int[n + 1];
		
		// Initialize the first two fibonacci numbers
		fib[0] = 0; // Fibonacci of 0 is 0
		fib[1] = 1; // fibonacci of 1 is 1
		
		// Fill the Fibonacci array with the bottom-up approach
		for (int i = 2; i <= n; i++) {
			// The Fibonacci number at position i is the sum of the previous two numbers
			fib[i] = fib[i-1] + fib[i-2];
		}
		
		// Return the nth Fibonacci number
		return fib[n];
	}

	public static void main(String[] args) {
		// Define the position of the fibonacci number to compute
		int n = 10;
		
		// Call the fibonacci method and print the result
		System.out.println("Fibonacci of " + n + ": " + fibonacci(n));		

	}

}
