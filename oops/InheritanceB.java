package com.greatlearning.oops;

public class InheritanceB extends InheritanceA{

    public float lenghth, breadth, result;

    public void rectangleArea(int l, int b) {
        lenghth = l;
        breadth = b;
        result = l * b;
        System.out.println("The area of the rectangle: "+result+" cm");
    }
}
