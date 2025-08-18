package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("gs")
public class GradeService {

	public String evaluateGrade(int marks) {
		if (marks >= 90) {
			return "A";
		} else if (marks >= 75) {
			return "B";
		} else if (marks >= 50) {
			return "C";
		} else {
			return "Fail";
		}
	}
}
