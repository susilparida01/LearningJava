package com.corejava.topfiftyexamples;

public class MaxSubArraySum {
	
	// Method to calculate the maximum subarray sum using kadane's algorithm
	public static int maxSubArraySum(int[] nums) {
		
		// Initialize maxSoFar and maxEndingHere with the first element of the array
		int maxSoFar = nums[0]; // Stores the maximum sum found so far
		int maxEndingHere = nums[0]; // Stores the maximum sum of subarray ending at the current position
		
		// Loop through the array starting from the second element
		for (int i = 1; i < nums.length; i++) {
			
			// Update maxEndingHere to be the larger of the current element or the sum of maxEndingHere and current element
			maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
			
			// Update maxSoFar if maxEndingHere is larger
			maxSoFar = Math.max(maxSoFar, maxEndingHere);
		}
		
		// Return the maximum sum of the subarray found
		return maxSoFar;
	}
	
	// Main method to test the maxSubArraySum method
	public static void main(String[] args) {
		
		// Input array of integer
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		
		// Call the maxSubArraySum method and print the result
		System.out.println("Maximum Subarray Sum: " + maxSubArraySum(nums));

	}

}
