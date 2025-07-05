package com.nit.sbean;

public class Student {
	private String name;
	private int studentId;
	private double examFee;
	private double amount;

	public Student() {
		// default constructor
	}

	// Constructor injection
	public Student(String name, int studentId, double examFee) {
		this.name = name;
		this.studentId = studentId;
		this.examFee = examFee;
	}

	// Setter injection
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getExamFee() {
		return examFee;
	}

	public double getAmount() {
		return amount;
	}

	public String getName() {
		return name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setExamFee(double examFee) {
		this.examFee = examFee;
	}

	// Default payFee
	public double payFee() {
		return amount - examFee;
	}

	public void displayDetails() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", studentId=" + studentId + ", Amount for fee=" + amount + ", examFee="
				+ examFee + "].......";
	}
}
