package com.nareshIT.day65;

public class Student {
	String name ;
	EducationInstitute institute;
	
	Course c1[] = {};
	Course java = new Course(1, "java", 12);
	Course c2[] = {java};
	Course c3[] = {new Course(2, "Pyh", 112)};
	
	public Student(String name, EducationInstitute institute) {
		super();
		this.name = name;
		this.institute = institute;
	}
	public void viewCoursesAndFees() {
		Course[] cn = institute.getCourses();
		System.out.println("Course Name and His Fees: ");
		for (Course cn1 : cn) {
			System.out.println("\t"+cn1.getCourseName()+"\t"+cn1.getCorseFee());
		}
	}
	
	public 	void viewOffers() {
		Offer of [] = institute.getOffeers();
		System.out.println("Offers on course : ");
		for (Offer of1 : of) {
			System.out.println("\t"+of1.offerText);
		}
	}
	public void enrollInCourse(int courseId){
		institute.enrollStudentInCourse(courseId, name);
	}
}
