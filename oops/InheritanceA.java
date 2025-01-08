package com.greatlearning.oops;
/*
Description
Write an algorithm to create classes InheritanceA, InheritanceB and InheritanceC to find the area of
circleArea, rectangleArea and triangleArea respectively. Use multi level inheritance and
execute all methods using the object of class InheritanceC.

Note: create methods circleArea, rectangleArea and triangleArea in the classes InheritanceA,
InheritanceB and InheritanceC respectively.

Algorithm:
a.Start
b.Create classes InheritanceA,InheritanceB and InheritanceC
c.Create methods circleArea,rectangleArea and triangleArea in classes InheritanceA,InheritanceB and InheritanceC
respectively where methods can take parameters as needed..
d.Write your logic in the methods to calculate the respective areas.
e.Extend InheritanceA to InheritanceB using extends keyword.
f.Similarly extend InheritanceB to InheritanceC using extends keyword.
g.Create main method inInheritanceC class
h.Create an object of InheritanceC as inheritancec.
i.Execute the methods of all classes using the objectinheritancec.
j.Stop
 */

//For inheritanceA:
public class InheritanceA {
    final float pi = 22 / 7;
    public float radius,result;

    public void circleArea(float rad){

        radius = rad;
        result = pi * radius * radius;
        System.out.println("The area of the circle is: "+result+" cm");

    }


}
