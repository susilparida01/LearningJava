package com.corejava.topfiftyexamples;

public class ReverseString {
	
	// this method reverse a string recursively
	public static String reverse(String str) {
		
		// Base Case: if the string is empty, return it as is.
		if (str.isEmpty()) {
			return str;
		}
		
		// Recursive case: call the method with the substring (removing the first character)
		// and append the first character at the end of the reversed sub-string
		return reverse(str.substring(1)) + str.charAt(0); 
		
	}

	public static void main(String[] args) {
		
		// Input string to be reversed
		String input = "Hello";
		
		// Call the reverse method and print the reversed string
		System.out.println("Reverse: " + reverse(input));

	}

}
