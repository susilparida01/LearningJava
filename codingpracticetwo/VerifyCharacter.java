package com.greatlearning.codingpracticetwo;
/*
Write a Java program to check whether the character is an alphabet/ digit/special character
 */

public class VerifyCharacter {
    public static void main(String[] args) {
        char ch = 'r';
        if (ch>='a' && ch<= 'z' || ch>='A' && ch<='Z'){
            System.out.println("The character "+ch+" is alphabet");
        }
        else if (ch>='0' && ch<='9'){
            System.out.println("The charater "+ch+" is a number");
        }
        else{
            System.out.println("The character "+ch+" is special character");
        }
    }
}
