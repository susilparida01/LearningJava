package com.greatlearning.codingpractice;

public class isStringPalindrome {

    //Function that returns true if the string is palindrome
    static boolean checkPalindome(String str)
    {
        // Pointers pointing to the beginning and the end of the string
        int i = 0, j = str.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and decrement the other
            i++;
            j--;
        }
        // Given string is a palindrome
        return true;
    }

    // Driver Code
    public static void main(String[] args)
    {
        String str = "madam";

        if (checkPalindome(str))
            System.out.println("yes");
        else
            System.out.println("No");

    }
}
