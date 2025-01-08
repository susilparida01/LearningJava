package com.greatlearning.oops;

public class InheritanceC extends InheritanceB{

    public float base, height, result;

    public void triangleArea(int b, int h){
        base = b;
        height = h;
        result = 0.5f * base * height;
        System.out.println("The area of the triangle is: "+result+" cm square");
    }

    public static void main(String[] args) {
        InheritanceC inheritanceC = new InheritanceC();
        inheritanceC.circleArea(22.5f);
        inheritanceC.rectangleArea(5,6);
        inheritanceC.triangleArea(3,4);
    }
}
