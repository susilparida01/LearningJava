package com.corejava.topfiftyexamples;

import java.util.Stack;

//Node class representing a single node in a linked list
class Node{
	int data; // Data value stored in the node
	Node next; // Reference to the next node in the list
	
	// Constructor to initialize a node with given data
	Node (int data){
		this.data = data; // Set the data for the node
		this.next = null; // Initialize the next reference as null
	}
	
}


public class PalindromeLinkedList {
    public static boolean isPalindrome(Node head) {
        Stack<Integer> stack = new Stack<>();
        Node current = head;

        // Push all elements into the stack
        while (current != null) {
            stack.push(current.data);
            current = current.next;
        }

        // Compare elements while traversing again
        current = head;
        while (current != null) {
            if (current.data != stack.pop()) {
                return false;
            }
            current = current.next;
        }

        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        System.out.println("Is palindrome: " + isPalindrome(head));
    }
}
