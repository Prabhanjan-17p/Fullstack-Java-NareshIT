package com.nareshIT.day28;

public class Tester {

	public static void main(String[] args) {
		Hosteller h = new Hosteller(1, "kanha", 5000, 5000);
		System.out.println(h.displayDetails());
		h.payAmount(1000);
	
		System.out.println("");

		DayScholar d = new DayScholar(2, "Hero", 5000, 1000);
		System.out.println(d.displayDetails());
		d.payAmount(6000);
		
	}

}
