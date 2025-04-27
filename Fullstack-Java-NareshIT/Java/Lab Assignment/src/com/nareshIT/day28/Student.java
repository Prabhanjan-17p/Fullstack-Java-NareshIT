package com.nareshIT.day28;

public class Student {
	int studentId ;
	String name ;
	double examFee;
	
	public Student(int studentId, String name, double examFee) {
		super();
	    if (examFee <= 0) {
	            System.out.println("Error Invalid Input");
	            System.exit(0);
	    }
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}
	public String displayDetails() {
		return "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
	}
	public double payFee() { 
		return examFee;
	}
}
