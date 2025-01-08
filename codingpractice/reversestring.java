package com.greatlearning.codingpractice;

public class reversestring {


    public static void main(String[] args) {

        String s = "susil";
        String t = "";
        for (int i=s.length()-1;i>=0;i--)
        {
            t = t + s.charAt(i);
        }
        System.out.println(t);
    }
}
