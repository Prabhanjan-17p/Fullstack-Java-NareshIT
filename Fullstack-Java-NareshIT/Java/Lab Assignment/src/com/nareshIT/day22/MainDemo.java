package com.nareshIT.day22;

import java.util.Scanner;

public class MainDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter student name : ");
		String name = sc.nextLine();

		System.out.print("Enter student mark : ");
		int marks = sc.nextInt();
		
		Student s = new Student(name, marks);
		StudentGrade ss =CalculateStudentGrade.calculateGrade(s);
		System.out.println(s);
		System.out.println(ss);
		
		sc.close();
	}

}
