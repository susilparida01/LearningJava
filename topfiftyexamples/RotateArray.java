package com.corejava.topfiftyexamples;

import java.util.Arrays;

public class RotateArray {
	
    // Method to rotate the array by k steps
    public static void rotate(int[] nums, int k) {
    	
    	// Handle cases where k is greater than array length
        k %= nums.length; 
        
        // Reverse the entire array
        reverse(nums, 0, nums.length - 1); 
        
        // Reverse the first k elements
        reverse(nums, 0, k - 1); 
        
        // Reverse the remaining elements
        reverse(nums, k, nums.length - 1); 
    }

    // Helper method to reverse a portion of the array
    private static void reverse(int[] nums, int start, int end) {
    	
    	// Loop until start meets or exceeds end
        while (start < end) { 
        	
        	// Temporarily store the value at start
            int temp = nums[start]; 
            
            // Swap the values at start and end
            nums[start] = nums[end]; 
            
            // Assign the temporary value to the end
            nums[end] = temp; 
            
            // Move start pointer forward
            start++; 
            
            // Move end pointer backward
            end--; 
        }
    }

    public static void main(String[] args) {
    	
    	// Input array
        int[] nums = {1, 2, 3, 4, 5, 6, 7}; 
        
        // Number of steps to rotate
        int k = 3; 
        
        // Call the rotate method
        rotate(nums, k); 
        
        // Print the rotated array
        System.out.println("Rotated Array: " + Arrays.toString(nums)); 
    }
}
