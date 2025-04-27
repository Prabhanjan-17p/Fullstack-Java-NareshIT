package com.nareshIT.day42;

public class ScienceStudent extends Student{

	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	
	public ScienceStudent(int physicsMarks, int chemistryMarks, int mathsMarks) {
		super();
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}

	@Override
	public int getPercentage() {
		int sum = (physicsMarks+chemistryMarks+mathsMarks)/3;
		return sum;
	}

}
