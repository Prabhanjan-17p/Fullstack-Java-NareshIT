package com.nareshIT.day4;

public class CycleSellingPrice {
    public static void main(String[] args) {
        // Given values
        double purchasePrice = 1200;    
        double repairCost = 250;       
        double coloringCost = 350;      
        double accessoriesCost = 500;   
        double desiredProfit = 1500;    

        
        double totalCostPrice = purchasePrice + repairCost + coloringCost + accessoriesCost;

        
        double sellingPrice = totalCostPrice + desiredProfit;

        
        System.out.println("Purchase Price: Rs. " + purchasePrice);
        System.out.println("Repair Cost: Rs. " + repairCost);
        System.out.println("Coloring Cost: Rs. " + coloringCost);
        System.out.println("Accessories Cost: Rs. " + accessoriesCost);
        System.out.println("Total Cost Price: Rs. " + totalCostPrice);
        System.out.println("Desired Profit: Rs. " + desiredProfit);
        System.out.println("Selling Price of the Cycle: Rs. " + sellingPrice);
    }
}
