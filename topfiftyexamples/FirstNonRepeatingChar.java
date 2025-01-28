package com.corejava.topfiftyexamples;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
	 
	//Method to find the first non-repeating character in a string
	public static char firstNonRepeatingChar(String str) {
		
		// Using LinkedHashMap to maintain the order of characters as they appear
		Map<Character, Integer> charCount = new LinkedHashMap<>();
		
		// Loop through each character in the string and count its occurrences
		for (char c : str.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}
		
		// Iterate through the map to find the first character with a count of 1
		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			
			// If the character occurs only once, return it as the first non-repeating character
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		
		// If no non-repeating character is found, return a placeholder '_'
		return '_';
		
	}
	
	
	// Main method to test the firstNonRepeatingchar method 
	public static void main(String[] args) {
		
		// Input string for testing		
		String input = "swiss";
		
		
		System.out.println("First non-repeating character: " + firstNonRepeatingChar(input));

	}

}
