package com.nareshIT.day42;

public abstract class Student {
	protected String studentName;
	protected String studentClass;
	static int totalNoOfStudents;
	
	abstract public int getPercentage();
	public int getTotalNoStudents() {
		return 0;
	}
	Student(){}
	public Student(String studentName, String studentClass) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
		totalNoOfStudents++;
	}
}
