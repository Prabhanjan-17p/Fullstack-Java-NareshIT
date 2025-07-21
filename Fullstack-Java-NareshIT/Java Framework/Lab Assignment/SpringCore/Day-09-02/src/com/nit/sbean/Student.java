package com.nit.sbean;

public class Student {
	private University university;

	public Student(University university) {
		super();
		this.university = university;
	}

	public void showUniversity() {
		System.out.println("Student belongs to: " + university.getUniversityName());
	}
}
