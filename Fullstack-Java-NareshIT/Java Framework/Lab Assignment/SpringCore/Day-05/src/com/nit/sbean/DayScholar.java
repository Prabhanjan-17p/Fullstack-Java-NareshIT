package com.nit.sbean;

public class DayScholar extends Student {

	private double transportFee;

	public DayScholar() {
		super();
	}

	public DayScholar(String name, int studentId, double examFee) {
		super(name, studentId, examFee);
	}

	public void setTransportFee(double transportFee) {
		this.transportFee = transportFee;
	}

	@Override
	public double payFee() {
		double totalFee = getExamFee() + transportFee;
		return getAmount() - totalFee;
	}

	@Override
	public void displayDetails() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "DayScholar [transportFee=" + transportFee + ", name=" + getName() + ", studentId=" + getStudentId()
				+ ", Amount for fee=" + getAmount() + ", examFee=" + getExamFee() + "]";
	}
}
