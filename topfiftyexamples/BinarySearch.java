package com.corejava.topfiftyexamples;

public class BinarySearch {
	
	// Method tp perform binary search on a sorted array
	public static int binarySearch(int[] arr, int target) {
		
		// Initialize Left and right pointer
		int left = 0, right = arr.length - 1;
		
		// Loop until the left pointer exceeds the right pointer
		while (left <= right) {
			
			// Calculate the middle index to avoid overflow
			int mid = left + (right - left) / 2;
			
			// Check if the middle element is the target
			if (arr[mid] == target) {
				return mid;  // Return the index of the target
			}
			
			// If the target is greater, ignore the left half
			else if (arr[mid] < target) {
				left = mid + 1;  // Move the left pointer to mid + 1
			}
			
			// If the target is smaller, ignore the right half
			else {
				right = mid - 1;  // Move the right pointer to mid - 1
			}
		}
		
		// Return -1 if the target is not found in the array
		return -1;
	}

	public static void main(String[] args) {
		
		// Sorted input array
		int[] arr = {1,3,5,7,9};
		
		// Target element to search
		int target = 5;
		
		// Call the binary search method
		int index = binarySearch(arr, target);
		
		// Print the result of the search
		System.out.println("Element found at index: " + index);

	}

}
