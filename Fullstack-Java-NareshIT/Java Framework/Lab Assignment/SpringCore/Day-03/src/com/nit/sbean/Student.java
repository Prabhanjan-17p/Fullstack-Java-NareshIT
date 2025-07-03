package com.nit.sbean;

public class Student {
	String student_name;
	int student_rollNo;
	int math_Marks;
	int physics_Marks;
	float chemistry_marks;
	double english_marks;
	double physicalEdu_marks;
	boolean isExamAttended;
	double average ;
	
	
	public String getStudent_name() {
		return student_name;
	}


	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}


	public int getStudent_rollNo() {
		return student_rollNo;
	}


	public void setStudent_rollNo(int student_rollNo) {
		this.student_rollNo = student_rollNo;
	}


	public int getMath_Marks() {
		return math_Marks;
	}


	public void setMath_Marks(int math_Marks) {
		this.math_Marks = math_Marks;
	}


	public int getPhysics_Marks() {
		return physics_Marks;
	}


	public void setPhysics_Marks(int physics_Marks) {
		this.physics_Marks = physics_Marks;
	}


	public float getChemistry_marks() {
		return chemistry_marks;
	}


	public void setChemistry_marks(float chemistry_marks) {
		this.chemistry_marks = chemistry_marks;
	}


	public double getEnglish_marks() {
		return english_marks;
	}


	public void setEnglish_marks(double english_marks) {
		this.english_marks = english_marks;
	}


	public double getPhysicalEdu_marks() {
		return physicalEdu_marks;
	}


	public void setPhysicalEdu_marks(double physicalEdu_marks) {
		this.physicalEdu_marks = physicalEdu_marks;
	}


//	public boolean isExamAttended() {
//		return isExamAttended;
//	}


	public void setIsExamAttended(boolean isExamAttended) {
		this.isExamAttended = isExamAttended;
	}


	public double getAverage() {
		return average;
	}


	public void setAverage(double average) {
		this.average = average;
	}


	public int getResult() {
		if (isExamAttended) {
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
