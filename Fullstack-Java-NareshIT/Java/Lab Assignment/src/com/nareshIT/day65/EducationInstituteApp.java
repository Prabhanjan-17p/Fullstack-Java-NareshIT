package com.nareshIT.day65;

import java.util.Scanner;

public class EducationInstituteApp {

	public static void main(String[] args) {
		Course c1 = new Course(101, "JAVA", 30000);
		Course c2 = new Course(102, "PYTHON", 12000);
		Course c3 = new Course(103, ".NET", 30000);
		Course [] courses = {c1,c2,c3};
		
		Offer of1 = new Offer("Special discount: Get 20% off on all courses!");
		Offer of2 = new Offer("Limited time offer: Enroll in any two courses and get one course free!");
		Offer [] offers = {of1,of2};
		
		EducationInstitute ed = new EducationInstitute(courses, offers);
		
		Student s1 = new Student("Virat", ed);
		Student s2 = new Student("Dhoni", ed);
		
		Thread t1 = new Thread(()->{
			synchronized (EducationInstituteApp.class) {
				s1.viewCoursesAndFees();
				s1.viewOffers();
				s1.enrollInCourse(101);
			}
			
		});
		Thread t2 = new Thread(()->{
			synchronized (EducationInstituteApp.class) {
				s2.viewCoursesAndFees();
				s2.viewOffers();
				s2.enrollInCourse(103);
			}
			
		});
		t1.start();
		t2.start();
	
	}

}
