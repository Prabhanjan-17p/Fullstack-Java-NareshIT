package com.nareshIT.day54;

import java.util.Scanner;

public class ClassNotFoundExpDemo
{
	public  ClassNotFoundExpDemo(String name) {
		try {
			Class<?> cls = Class.forName(name);
			System.out.println("Class "+name+" found: "+cls.getName());
		} catch (Exception e) {
			System.out.println("Class " + name + " not found.");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the class name to load: ");
		String name = sc.nextLine();
		ClassNotFoundExpDemo c = new ClassNotFoundExpDemo(name);
	}

}
