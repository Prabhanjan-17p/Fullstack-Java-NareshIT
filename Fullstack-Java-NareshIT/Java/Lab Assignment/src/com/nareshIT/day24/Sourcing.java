package com.nareshIT.day24;

public class Sourcing {
	int id;
	String name ; 
	double basicSalary;
	double HRAPer ;
	double DAPer;
	int enrollmentTarget;
	int enrollmentReached;
	double perkPerEnrollment;
	
	public Sourcing(int id, String name, double basicSalary, double hRAPer, double dAPer, int enrollmentTarget,
			int enrollmentReached, double perkPerEnrollment) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
	}


	public double calculateGrossSalary() {
		return  ((basicSalary+HRAPer+DAPer+((enrollmentReached/enrollmentTarget)*100)*
				perkPerEnrollment));
	}
}
