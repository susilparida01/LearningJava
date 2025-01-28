package com.corejava.topfiftyexamples;

// Node class representing a single node in a linked list
class Node{
	int data; // Data value stored in the node
	Node next; // Reference to the next node in the list
	
	// Constructor to initialize a node with given data
	Node (int data){
		this.data = data; // Set the data for the node
		this.next = null; // Initialize the next reference as null
	}
	
}

public class LinkedListCycle {
	
	// Method to check if a linked list contains a cycle
	public static boolean hasCycle(Node head) {
		
		// If the list is empty, there can be no cycle
		if (head == null) return false;
		
		// Initialize two pointers: slow move 1 step, fast moves 2 steps
		Node slow = head;
		Node fast = head;
		
		// Traverse the list with the two pointers
		while (fast != null && fast.next != null) {
			
			// Move the slow pointer one step forward
			slow = slow.next;
			
			// Move the fast pointer two steps forward
			fast = fast.next.next;
			
			// If slow and fast pointers meet, a cycle is detected 
			if (slow == fast) {
				return true;
			}
		}
		
		// If the loop completes, no cycle exists in the list
		return false;
	}

	// Main method to test the hasCycle method
	public static void main(String[] args) {
		
		// Create nodes for the linked list
		Node head = new Node(1);   // First node with data 1
		head.next = new Node(2);  // Second node with data 2
		head.next.next = new Node(3);  // Third node with data 3
		
		// Create a cycle by Linking the Last node back to the first node
		head.next.next.next = head;  // Third node points back to the first node
		
		// Check if the linked list contains a cycle and print the result
		System.out.println("Has cycle: " + hasCycle(head));  // Expected output: true

	}

}
