package com.nareshIT.day29;

public class PermanentEmployee extends Employee {
	protected double providentfund;
	double netSalary;

	public PermanentEmployee(int employeeId, String employeeName, double employeeSalary) {
		super(employeeId, employeeName, employeeSalary);
		this.providentfund = this.employeeSalary * 0.12;
	}
	

	@Override
	public String toString() {
		return "PermanentEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", providentfund=" + this.providentfund + "]";
	}
	
	public void netSalary() {
		netSalary = providentfund+employeeSalary;
		System.out.println("Net Salary is :"+netSalary);
	}
}
