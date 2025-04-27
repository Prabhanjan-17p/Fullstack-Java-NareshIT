package com.nareshIT.day42;

import java.util.Scanner;

public class StudentTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type of Student");
		System.out.println("1) Science Student");
		System.out.println("2) History Student");
		int std = sc.nextInt();
		sc.nextLine();
		
		Student s1 = null;
		if (std == 1) {
			System.out.println("Enter Physics Marks");
			int phy = sc.nextInt();
			System.out.println("Enter chemistry Marks");
			int che = sc.nextInt();
			System.out.println("Enter Math Marks");
			int math = sc.nextInt();
			s1 = new ScienceStudent(phy,che,math);
			System.out.println("Total Percentage = "+s1.getPercentage()+"%");
		}else {
			System.out.println("Enter History Marks");
			int hs = sc.nextInt();
			System.out.println("Enter Civic Marks");
			int civ = sc.nextInt();
			s1 = new HistoryStudent(hs, civ);
			System.out.println("Total Percentage = "+s1.getPercentage()+"%");
		}
		

	}

}
