package com.corejava.topfiftyexamples;

public class PrimeCheck {
	
	// This method checks if a number 'n' is prime or not
	public static boolean isPrime(int n) {
		
		// If the number is less than or equal to 1, it's not a prime
		if (n <= 1) return false;
		
		// Loop from 2 to the square root of 'n' inclusive to check for divisibility.
		for (int i = 2; i <= Math.sqrt(n); i++) {
			
			// If 'n' is divisible by 'i', it's not a prime number
			if (n % i == 0) return false;
		}
		 
		// if no divisors were found, the number is prime
		return true;
	}

	// Main method to test the isPrime method
	public static void main(String[] args) {
		
		// The number to be checked for primality.
		int num = 30;
		
		// Call the isPrime method and print whether the number is prime.
		System.out.println(num + " is prime: " + isPrime(num));

	}

}
