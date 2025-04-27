package com.nareshIT.day22;

public class CalculateStudentGrade {
	public static StudentGrade calculateGrade(Student std) {
		int mark = std.getMarks();
		if ( mark > 90) {
			return new StudentGrade(std, 'A');
		}
		else if ( mark >= 75){
			return new StudentGrade(std, 'B');
		}
		else if ( mark >= 60){
			return new StudentGrade(std, 'C');
		}
		else {
			return new StudentGrade(std, 'D');
		}
		
	}

	
}
