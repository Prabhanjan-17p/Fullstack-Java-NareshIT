package com.nt.service;

import org.springframework.stereotype.Service;

import com.nt.model.PayrollProperties;

@Service
public class PayrollService {
	private PayrollProperties payrollProperties;

	public PayrollService(PayrollProperties payrollProperties) {
		super();
		this.payrollProperties = payrollProperties;
	}

	public void printPayrollSnapshot() {
		System.out.println("Company: " + payrollProperties.getCompanyName());
		System.out.println("Currency: " + payrollProperties.getCurrency());
		System.out.println("Tax Rate: " + payrollProperties.getTaxRate() + "%");
		System.out.println("Overtime Enabled: " + payrollProperties.isOvertimeEnabled());
		System.out.println("Max Leaves: " + payrollProperties.getHolidayPolicy().getMaxLeaves());
		System.out.println("Carry Forward Allowed: " + payrollProperties.getHolidayPolicy().isCarryForward());
		System.out.println("Paid Leaves: " + payrollProperties.getHolidayPolicy().getPaidLeaves());
	}

	public void listAllBenefits() {
		System.out.println("\n--- Benefits ---");
		payrollProperties.getBenefits().forEach(b -> System.out.println(b.getName() + " : " + b.getAmount()));
	}

	public void showSalaryBandsAndDepartments() {
		System.out.println("\n--- Departments ---");
		payrollProperties.getDepartments().forEach(System.out::println);

		System.out.println("\n--- Salary Bands ---");
		payrollProperties.getSalaryBands().forEach((band, amount) -> System.out.println(band + " : " + amount));
	}
}
