package com.nareshIT.day4;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
    	if (args.length < 3) {
			System.out.println("Enter Principal Amount (Rs.): ,Rate of Interest (%): ,Time (in years): ");
			return;
    	}
    	
    	double PM = Integer.parseInt(args[0]);
    	double Rate = Integer.parseInt(args[0]);
    	double time = Integer.parseInt(args[0]);

        double simpleInterest = (PM * Rate * time) / 100;

        double totalAmount = PM + simpleInterest;

        System.out.println("\n====== Interest Calculation Result ======");
        System.out.println("Principal Amount: Rs. " + PM);
        System.out.println("Rate of Interest: " + Rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: Rs. " + simpleInterest);
        System.out.println("Total Amount (Principal + Interest): Rs. " + totalAmount);

        
    }
}
