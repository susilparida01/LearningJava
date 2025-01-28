package com.corejava.topfiftyexamples;

public class MissingNumber {
	
	// Method to find the missing number in the array of integers
	public static int findMissingNumber(int[] nums) {
		
		// Total number including the missing one (n = size of the array + 1)
		int n = nums.length + 1;
		
		// Calculate the sum of the first n natural numbers using formula n*(n+1)/2
		int expectedSum = n * (n + 1) / 2;
		
		// Initialize a variable to store the sum of array elements
		int actualSum = 0;
		
		// Loop through the array to calculate the actual sum of its elements
		for (int num : nums) {
			
			// Add each number in the array to actual sum
			actualSum += num;
		}
		
		// The difference gives the missing number
		return expectedSum - actualSum;
	}

	public static void main(String[] args) {
		
		// Input array with one number missing
		int[] nums = {1,2,4,5,6};
		System.out.println("Missing Number: " + findMissingNumber(nums));

	}

}
