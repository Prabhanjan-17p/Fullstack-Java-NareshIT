package com.nareshIT.day24;

public class Trainer {
	int id;
	String name ; 
	double basicSalary;
	double HRAPer ;
	double DAPer;
	int batchCount;
	double perkPerBatch;
	
	public Trainer(int id, String name, double basicSalary, double hRAPer, double dAPer, int batchCount,
			double perkPerBatch) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.batchCount = batchCount;
		this.perkPerBatch = perkPerBatch;
	}

	public double calculateGrossSalary() {
		return  basicSalary +HRAPer +DAPer +(batchCount * perkPerBatch);
	}
}
