package com.corejava.topfiftyexamples;

import java.util.HashSet;  // Importing HashSet class for storing unique elements
import java.util.ArrayList;  // Importing ArrayList class for sorting duplicates

public class FindDuplicates {
	
	// Method to find duplicates in an array and add them to a list
	public static  ArrayList<Integer> findDuplicates(int [] nums) {
		
		HashSet<Integer> seen = new HashSet<>();    // Create a HashSet to keep track of seen numbers
		ArrayList<Integer> duplicates = new ArrayList<>();  // Create a list to store  duplicates
		
		// Loop through each number in the input array
		for (int num : nums) {
			// Check if the number is already in the HashSet
			if (seen.contains(num)) {
				// If yes, it is a duplicate; print the duplicate number
				System.out.println("Duplicate found: " + num);
				duplicates.add(num);
			}else {
				// If no, add the number to the HashSet
				seen.add(num);
			}
		}
		
		// Return the list of duplicates
		return duplicates;
	}
  
	// Main method to test the findDuplicates method
	public static void main(String[] args) {
		
		// Input array with duplicate numbers
		int[] nums = {1,2,3,4,2,5,3};
		
		// Call the method to get duplicates
		ArrayList<Integer> duplicates = findDuplicates(nums);
		
		// Print All duplicates
		System.out.println("Duplicates: " + duplicates);

	}

}
