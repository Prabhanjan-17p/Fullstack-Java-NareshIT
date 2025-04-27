package com.nareshIT.day23;

public class TimeTester {

	public static void main(String[] args) {
		Time T1 = new Time( 2,59,59);
		Time T2 = new Time(4,59,59);
		Time sum = Time.add(T1, T2);
	}

}
