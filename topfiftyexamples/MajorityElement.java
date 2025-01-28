package com.corejava.topfiftyexamples;

public class MajorityElement {
	
    public static int findMajorityElement(int[] nums) {
    	
    	// Initialize count to 0 and candidate to -1
        int count = 0, candidate = -1; 

        // Find the candidate for the majority element
        for (int num : nums) {
        	
        	// If count is 0, select the current number as a new candidate
            if (count == 0) { 
                candidate = num; // Update the candidate
            }
            // Increment count if the current number matches the candidate, otherwise decrement
            count += (num == candidate) ? 1 : -1; 
        }

        // Verify if the candidate is indeed the majority element
        count = 0; // Reset count to 0 for verification
        for (int num : nums) {
            if (num == candidate) { // Count how many times the candidate appears
                count++;
            }
        }

        // Return the candidate if it appears more than n/2 times, otherwise return -1
        return count > nums.length / 2 ? candidate : -1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 3, 3}; // Example array
        System.out.println("Majority Element: " + findMajorityElement(nums)); // Call the method and print the result
    }
}
