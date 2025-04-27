package com.nareshIT.day4;

public class TVSellingPrice {
    public static void main(String[] args) {

        double costPrice = 32500;      
        double profitPercentage = 27; 
        double vatPercentage = 12.7;   
        double serviceChargePercentage = 3.87; 

        double profitAmount = (costPrice * profitPercentage) / 100;

        double sellingPrice = costPrice + profitAmount;

        double vatAmount = (sellingPrice * vatPercentage) / 100;

        double serviceChargeAmount = (sellingPrice * serviceChargePercentage) / 100;

        double totalSellingPrice = sellingPrice + vatAmount + serviceChargeAmount;

        
        System.out.println("Cost Price of TV: Rs. " + costPrice);
        System.out.println("Profit Amount (27%): Rs. " + profitAmount);
        System.out.println("Selling Price before VAT & Service Charge: Rs. " + sellingPrice);
        System.out.println("VAT Amount (12.7%): Rs. " + vatAmount);
        System.out.println("Service Charge Amount (3.87%): Rs. " + serviceChargeAmount);
        System.out.println("Total Selling Price (Final Price): Rs. " + totalSellingPrice);
    }
}