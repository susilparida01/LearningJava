package com.greatlearning.codingpractice;

public class starPatternPrint {
    public static void main(String[] args) {

        int no = 5;
        //loop to keep count of no of rows
        for (int i = 0;i < 5;i++){
            //inner loop to keep count of *
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            //change to new line once inner loop is finished
            System.out.println();

        }

    }

}
