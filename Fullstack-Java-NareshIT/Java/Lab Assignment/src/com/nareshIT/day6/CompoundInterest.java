package com.nareshIT.day6;

public class CompoundInterest {

	public static void main(String[] args) {
		//amount=principle*((1+rate/100)*(1+rate/100)*(1+rate/100));
		if (args.length >= 1) {
			return ;
		}
		int principle = Integer.parseInt(args[0]);
		int rate = Integer.parseInt(args[1]);
		int amount = principle*((1+rate/100)*(1+rate/100)*(1+rate/100));
		System.out.println("The total amount is = "+amount);
	}

}
