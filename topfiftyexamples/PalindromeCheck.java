package com.corejava.topfiftyexamples;

public class PalindromeCheck {
	
	public static boolean isPalindrome(String str) {
		
		// Initialize two pointers: one at the beginning (left) and one at the end (right)
		int left = 0, right = str.length()	- 1;
		
		// Loop until the pointers meet in the middle
		while (left < right) {
			
			// Compare characters at the left and right pointers
			if (str.charAt(left) != str.charAt(right)) {
				// If characters don't math, the string is not a palindrome
				return false;
				
			}
			
			// Move the left pointer forward
			left ++;
			// Move the right pointer backward
			right --;
		}
		
		// If all characters match, the string is a palindrome
		return true;
	}

	public static void main(String[] args) {
		
		// Input string to check
		String input = "madam";
		
		// Call the isPalindrome method and print the result
		System.out.println("Is palindrome: " + isPalindrome(input));

	}

}
