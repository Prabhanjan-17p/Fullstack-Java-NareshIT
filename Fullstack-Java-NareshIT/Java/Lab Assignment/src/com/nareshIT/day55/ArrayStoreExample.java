package com.nareshIT.day55;

import java.util.Scanner;

public class ArrayStoreExample {

	public static void main(String[] args) {
		try {
			storeObjects();
			System.out.println("Objects stored successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void storeObjects() throws Exception {
		Scanner sc = new Scanner(System.in);
		Object[] obj = new String[5];
		obj[0] = "java";
		obj[1] = 2;

	}
}
