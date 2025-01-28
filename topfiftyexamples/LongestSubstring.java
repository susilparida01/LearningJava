package com.corejava.topfiftyexamples;

import java.util.HashSet;   // Import HashSet to store unique characters

public class LongestSubstring {
	
	// Method to find the length of the longest substring without repeating characters
	public static int lengthOfLongestSubstring(String s) {
		
		// HashSet to store unique characters in the current window
		HashSet<Character> set = new HashSet<>();
		
		// Initialize left pointer and maxLength variable
		int left = 0, maxLength = 0;
		
		// Iterate through the string with the right pointer
		for (int right = 0; right < s.length(); right++) {
			// If the character at the right pointer is already in the set
			while (set.contains(s.charAt(right))) {
				set.remove(s.charAt(left));   // Remove the character at the left pointer from the set
				left++;  // Move the left pointer forward
			}
			
			// Add the character at the right pointer to the set
			set.add(s.charAt(right));
			
			// Update maxLength to the maximum window size
			maxLength = Math.max(maxLength, right - left + 1);
		}
		// Return the maximum length of substring found
		return maxLength;
		
	}

	public static void main(String[] args) {
		
		// Input string to find the longest substring
		String input = "abcabcbb";
		System.out.println("Length of Longest Substring: " + lengthOfLongestSubstring(input) );

	}

}
