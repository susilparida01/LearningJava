package com.greatlearning.oops;
/*
Write a program in Java to implement classes and objects.

1. Create a class
2. Copy and paste the below code in class.
3. Create a main method in the class.
4. Create an object “obj” for the class in the main method.
5. Execute the copyMe() method using the object created.
 */

public class Class { //this is a class

    void copyMe(){
        System.out.println("Inside copy me method");
    }

    public static void main(String[] args) {
        //This is mail method
        //Create object here
        Class obj = new Class();
        obj.copyMe();
    }

}
