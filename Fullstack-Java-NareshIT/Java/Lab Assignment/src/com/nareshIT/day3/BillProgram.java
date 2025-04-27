package com.nareshIT.day3;

import java.util.Scanner;

public class BillProgram {

	public static void main(String[] args) {
		int CountChickenRolls =0;
		int CountVegetablePuffs =0;
      	Scanner sc = new Scanner(System.in);
      	System.out.println("Enter the  number Chicken Rolls");
  		CountChickenRolls = sc.nextInt();
  		System.out.println("Enter the  number Vegetable Puffs");
  		CountVegetablePuffs = sc.nextInt();
  		int totChicken = CountChickenRolls*60;
  		int totVeget = CountVegetablePuffs*25;
  		int totBill = (totVeget+totChicken)-50;
  		System.out.println("Final bill = "+totBill);

	}

}
