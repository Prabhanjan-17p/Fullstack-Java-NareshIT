package com.nit.sbean;

public class StudentConstructor {
	String student_name;
	int student_rollNo;
	int math_Marks;
	int physics_Marks;
	float chemistry_marks;
	double english_marks;
	double physicalEdu_marks;
	boolean isExamAttended;
	double average ;
	
	
	public StudentConstructor(String student_name, int student_rollNo, int math_Marks, int physics_Marks,
			float chemistry_marks, double english_marks, double physicalEdu_marks, boolean isExamAttended) {
		super();
		this.student_name = student_name;
		this.student_rollNo = student_rollNo;
		this.math_Marks = math_Marks;
		this.physics_Marks = physics_Marks;
		this.chemistry_marks = chemistry_marks;
		this.english_marks = english_marks;
		this.physicalEdu_marks = physicalEdu_marks;
		this.isExamAttended = isExamAttended;
	}


	public String getStudent_name() {
		return student_name;
	}


	public int getStudent_rollNo() {
		return student_rollNo;
	}


	public int getMath_Marks() {
		return math_Marks;
	}


	public int getPhysics_Marks() {
		return physics_Marks;
	}


	public float getChemistry_marks() {
		return chemistry_marks;
	}


	public double getEnglish_marks() {
		return english_marks;
	}


	public double getPhysicalEdu_marks() {
		return physicalEdu_marks;
	}


	public boolean isExamAttended() {
		return isExamAttended;
	}


	public double getAverage() {
		return average;
	}


	public int getResult() {
		if (isExamAttended()) {
			average = (getMath_Marks()+getChemistry_marks()+getEnglish_marks()+getPhysicalEdu_marks()+getPhysics_Marks())/5;
			return 1;
		}
		else {
			System.out.println("Exam Not Attended!!");
			math_Marks =0;physics_Marks=0;chemistry_marks=0;english_marks=0;physicalEdu_marks=0;average=0.0;
			return 0;
		}
	}


	@Override
	public String toString() {
		return "Student [student_name=" + student_name + ", student_rollNo=" + student_rollNo + ", math_Marks="
				+ math_Marks + ", physics_Marks=" + physics_Marks + ", chemistry_marks=" + chemistry_marks
				+ ", english_marks=" + english_marks + ", physicalEdu_marks=" + physicalEdu_marks + ", isExamAttended="
				+ isExamAttended + ", average=" + average + "]";
	}
	
	
}
