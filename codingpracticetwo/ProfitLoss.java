package com.greatlearning.codingpracticetwo;
/*
Write a Java program to find whether the transaction is a profit or a loss (use cost price and selling price as hardcoded variables)
 */
public class ProfitLoss {
    public static void main(String[] args) {
        int costPrice = 400;
        int sellPrice = 450;
        int profit, loss;
        if (sellPrice>costPrice){
            profit = sellPrice - costPrice;
            System.out.println("Profit: "+profit);
        }
        else if (sellPrice<costPrice){
            loss = costPrice - sellPrice;
            System.out.println("Loss: "+loss);
        }
        else {
            System.out.println("No profit No loss");
        }
    }
}
