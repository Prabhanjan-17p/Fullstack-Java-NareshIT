package com.nareshIT.day13;

import java.util.Scanner;

public class Student {
	
	int rollNumber;
	String name;
	int mark;
	char gr ;
	
	public void setDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your roll number: ");
		rollNumber = sc.nextInt();
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		name = sc.nextLine();
		System.out.println("Enter your mark: ");
		mark = sc.nextInt();
		gr = calGread(mark);
	}
	
	public char calGread(int num) {
		if (num > 90) {
			return 'A';
		}
		else if (num > 80 ) {
			return 'B';
		}
		else if (num > 70 ) {
			return 'C';
		}
		else if (num > 60 ) {
			return 'D';
		}
		else {
			return 'E';
		}
	}
	
	public String getDetails() {
		return "[ Student roll number is "+ rollNumber + ", name is "+name+
				",  mark is "+mark +", grade is "+ gr +"]";
	}
}
