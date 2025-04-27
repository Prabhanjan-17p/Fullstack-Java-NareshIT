package com.nareshIT.day42;

import java.util.*;

public class Testing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of food item: ");
		int numberOfTime=0;
		sc.nextLine();
		
		System.out.print("Enter the name of the food item: ");
		String nameItem = sc.nextLine();
		
		Food f = null;
		if (numberOfTime == 1) {
			
			f = new Bread(4.1,1.1,13.8);
			f.getMacroNutrients();
		}else {
			f = new Egg(4.1,1.1,13.8);
			f.getMacroNutrients();
		}
		sc.close();
	}

}
