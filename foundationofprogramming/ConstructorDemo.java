package com.greatlearning.foundationofprogramming;
/*
a.Start
b.Create a classConstructorDemo
c.Create one default and one parameterized constructor
d.Introduce yourself in the default constructor.
e.In parameterized constructor, accept full name, age,location or anything needed as input arguments.
f.Create a main method in the same class
g.Create an objectobjin main method
h.Execute or print both constructor
i.Stop
 */

public class ConstructorDemo {
    public ConstructorDemo() {
        System.out.println("Good Day Learners!. This isHarshit and I am 25 yearsold.\n" + "I am from Uttar Pradesh " + "Happy Learning!!!");
    }

    public ConstructorDemo(String name, int age, String location) {
        System.out.println("\n\nGood Day Learners!. Thisis " + name + " and I am" + age + " years old.\n" + "I am from " + location + " Happy Learning");
    }

    public static void main(String[] args) {
        ConstructorDemo constructorDemo;
        constructorDemo = new ConstructorDemo();
        constructorDemo = new ConstructorDemo("Harshit", 25, " Uttar Pradesh");

    }

}
