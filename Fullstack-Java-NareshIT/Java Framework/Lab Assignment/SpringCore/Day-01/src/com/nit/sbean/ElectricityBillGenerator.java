package com.nit.sbean;

public class ElectricityBillGenerator {

	int unitsConsumed;
	double ratePerUnit;

	public ElectricityBillGenerator() {
		super();
		System.out.println("ElectricityBillGenerator 0 parameter Constructor");
	}

	public void setUnitsConsumed(int unitsConsumed) {
		System.out.println("ElectricityBillGenerator.setUnitsConsumed()");
		this.unitsConsumed = unitsConsumed;
	}

	public void setRatePerUnit(double ratePerUnit) {
		System.out.println("ElectricityBillGenerator.setRatePerUnit()");
		this.ratePerUnit = ratePerUnit;
	}

	public double generateBill() {
		return unitsConsumed * ratePerUnit;
	}


}
