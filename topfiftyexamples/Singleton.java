package com.corejava.topfiftyexamples;

public class Singleton {

    private static Singleton instance; 
    // Static variable to hold the single instance of the Singleton class

    private Singleton() {
        // Private constructor to restrict instantiation from outside the class
    }

    // Method to provide the global access point to the single instance
    public static Singleton getInstance() {
        if (instance == null) { 
            // Check if the instance is null; if true, create the instance
            instance = new Singleton();
        }
        return instance; 
        // Return the single instance of the class
    }

    public void showMessage() {
        System.out.println("Singleton Instance Created!"); 
        // Method to demonstrate the functionality of the Singleton instance
    }

    public static void main(String[] args) {
    	
    	// Access the Singleton instance using the getInstance method
        Singleton singleton = Singleton.getInstance();         
        
        // Call a method on the Singleton instance to verify it works
        singleton.showMessage(); 
        
    }
}
