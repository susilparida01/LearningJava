package com.corejava.topfiftyexamples;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
    	
    	// Get the length of the array
        int n = arr.length; 
        
        // Outer loop to control the number of passes
        for (int i = 0; i < n - 1; i++) { 
        	
        	// Inner loop to compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) { 
            	
            	// If the current element is greater than the next
                if (arr[j] > arr[j + 1]) { 
                	
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j]; // Store arr[j] in a temporary variable
                    arr[j] = arr[j + 1]; // Move arr[j+1] to arr[j]
                    arr[j + 1] = temp; // Assign the temporary value to arr[j+1]
                }
            }
        }
    }

    public static void main(String[] args) {
    	
    	// Example array to be sorted
        int[] arr = {5, 1, 4, 2, 8}; 
        
        // Call the bubbleSort method to sort the array
        bubbleSort(arr); 
        System.out.println("Sorted Array: " + Arrays.toString(arr)); // Print the sorted array
    }
}
