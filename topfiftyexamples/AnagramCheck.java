package com.corejava.topfiftyexamples;

import java.util.Arrays;   // Import Arrays class for sorting and comparison utilities

public class AnagramCheck {
	
	// Method to check if two strings are anagrams
	public static boolean areAnagrams(String str1, String str2) {
		
		// Check the length of the two strings are different
		// If lengths are not equal, they can not be anagram
		if (str1.length() != str2.length()) return false;
		
		// Convert the first string to a character array
		char[] arr1 = str1.toCharArray();
		
		// Convert the second string to a character array
		char[] arr2 = str2.toCharArray();
		
		// Sort the character array of the first string
		Arrays.sort(arr1);
		
		// Sort the character array of the second string
		Arrays.sort(arr2);
		
		// Compare the sorted arrays; if equal, the strings are Anagrams
		return Arrays.equals(arr1, arr2);
	}

	public static void main(String[] args) {
		
		// First input String
		String str1 = "listen";
		
		// Second input string
		String str2 = "silent";
		
		System.out.println("Are anagrams: " + areAnagrams(str1, str2));

	}

}
