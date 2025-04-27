package com.nareshIT.day5;

public class StringToDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//qns -1
		 if (args.length != 2) {
	            return;
	        }
	            double num1 = Double.parseDouble(args[0]);
	            double num2 = Double.parseDouble(args[1]);

	            double result = num1 * num2;

	            System.out.println("Multiplication Result: " + result);

//		qns - 2
		if (args.length == 0) {
			return;
		}
		int a = Integer.parseInt(args[0]);
		char ch = (char) a;
		System.out.println(ch);
		
		//3
        if (args.length != 2) {
            return;
        }

        double costPrice = Double.parseDouble(args[0]);
        double sellingPrice = Double.parseDouble(args[1]);


        if (sellingPrice > costPrice) {
            double profit = sellingPrice - costPrice;
            double profitPercentage = (profit / costPrice) * 100;
            System.out.println("Profit: " + profit);
            System.out.println("Profit Percentage: " + profitPercentage + "%");
        } else if (costPrice > sellingPrice) {
            double loss = costPrice - sellingPrice;
            double lossPercentage = (loss / costPrice) * 100;
            System.out.println("Loss: " + loss);
            System.out.println("Loss Percentage: " + lossPercentage + "%");
        } else {
            System.out.println("No Profit, No Loss.");
        }
	}

}
