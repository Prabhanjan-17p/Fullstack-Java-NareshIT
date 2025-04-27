package com.nareshIT.day4;

public class DiscountCalculator {
    public static void main(String[] args) { 		
        if (args.length == 0) {
            System.out.println("Enter a bill :");
            return;
        }

        
            double netBill = Double.parseDouble(args[0]);
            double discountPercentage;

            if (netBill < 5000) {
                discountPercentage = 5;
            } else if (netBill >= 5000 && netBill < 10000) {
                discountPercentage = 10;
            } else {
                discountPercentage = 15;
            }

            double discountAmount = (netBill * discountPercentage) / 100;

            double amountPayable = netBill - discountAmount;

            System.out.println("Net Bill Amount: Rs. " + netBill);
            System.out.println("Discount Percentage: " + discountPercentage + "%");
            System.out.println("Discount Amount: Rs. " + discountAmount);
            System.out.println("Final Payable Amount: Rs. " + amountPayable);
        
    }
}
