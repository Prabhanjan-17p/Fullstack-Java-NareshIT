package com.nareshIT.day65;

public class EducationInstitute {
//	Course [] courses = {new Course(101,"Java",30000),new Course(102,"Python",12000),new Course(103,".Net",25000)};
//	Offer [] offeers = {new Offer("5% discount on Java"),new Offer("2% discount on .Net")};
	
	Course [] courses = {};
	Offer [] offeers = {};
	public EducationInstitute(Course[] courses, Offer[] offeers) {
		super();
		this.courses = courses;
		this.offeers = offeers;
	}
	public Course[] getCourses() {
		return courses;
	}
	public Offer[] getOffeers() {
		return offeers;
	}
	
	public void enrollStudentInCourse(int courseId, String studentName){
		Course c1 [] = getCourses();
		for (Course course : c1) {
			if (course.courseId == courseId) {
				System.out.println(studentName + " has buy "+course);
			}
		}
	}
	
}
