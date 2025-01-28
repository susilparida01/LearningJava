package com.corejava.topfiftyexamples;

import java.util.ArrayList;  // Import ArrayList for dynamic list handling
import java.util.Arrays;
import java.util.HashSet;  // Import HashSet for storing unique elements
import java.util.List;   // Import List interface for returning results

public class ArrayIntersection {
	
	// Method to find the intersection of two arrays
	public static int[] findIntersection(int[] nums1, int[] nums2) {
		
		// Set to store unique elements from the first array.
		HashSet<Integer> set = new HashSet<>();
		
		// Set to store common elements between the two elements
		HashSet<Integer> intersection = new HashSet<>();
		
		for (int num : nums1) {
			// Add all elements of nums1 to the set
			set.add(num);
		}
		
		for (int num : nums2) {
			// Check if nums2 elements exists in the set
			if (set.contains(num)) {
				// Add common elements to the intersection set
				intersection.add(num);
			}
		}
		// Convert the intersection set to an array and return it
		return intersection.stream().mapToInt(i -> i).toArray();
	}

	public static void main(String[] args) {
		// First input array
		int[] nums1 = {1,2,2,1};
		
		// Second input array
		int[] nums2 = {2,2};
		
		System.out.println("Intersection: " + Arrays.toString(findIntersection(nums1, nums2)));

	}

}
