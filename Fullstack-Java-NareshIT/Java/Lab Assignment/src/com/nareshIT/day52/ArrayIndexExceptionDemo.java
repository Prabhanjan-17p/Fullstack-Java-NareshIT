package com.nareshIT.day52;

public class ArrayIndexExceptionDemo {

	public static void main(String[] args) {
		int a[] = new int[2];
		try {
			System.out.println(a[3]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
