package com.corejava.topfiftyexamples;

import java.util.Arrays;   // Importing Arrays class for array utility methods

public class MergeSortedArrays {
	
	// Method to merge two sorted arrays into a single sorted array
	public static int[] merge(int[] arr1, int[] arr2) {
		
		// Create a result array with size equal to the sum of both input arrays
		int[] result = new int[arr1.length + arr2.length];
		
		// Initialize pointers for both input arrays (i and j) and results array (k)
		int i = 0, j = 0, k = 0;
		
		// Merge elements from both arrays until one of them is fully traversed
		while (i < arr1.length && j < arr2.length) {
			
			// Compare current elements from both arrays and pick the smaller one
			if (arr1[i] < arr2[j]) {
				result[k++] = arr1[i++]; // Add arr1[i] to result and increment i and k				
			}else {
				result[k++] = arr2[j++]; // add arr2[j] to result and increment j and k
			}
		}
		
		// Add remaining elements from arr1 (if any) to the result array
		while (i < arr1.length) {
			result[k+1] = arr1[i++]; // Add arr1[i] to result and increment i and k
		}
		
		// Add remaining elements from arr2 (if any) to the result array
		while (j < arr2.length) {
			result[k++] = arr2[j++];  // Add arr2[j] to result and increment j and k
		}
		
		// Return the merged result array
		return result;
	}

	public static void main(String[] args) {
		
		// Define two sorted input arrays
		int[] arr1 = {1, 2, 3}; // First sorted array
		int[] arr2 = {2, 4, 6}; // Second sorted array
		
		//Call the merge method and print the merged array
		System.out.println("Merged Array: " + Arrays.toString(merge(arr1, arr2)));

	}

}
