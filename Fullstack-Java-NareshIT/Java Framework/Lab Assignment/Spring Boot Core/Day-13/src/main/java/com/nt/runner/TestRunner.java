package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.PayrollService;

@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	private PayrollService payrollService;

	@Override
	public void run(String... args) throws Exception {
		payrollService.printPayrollSnapshot();
        payrollService.listAllBenefits();
        payrollService.showSalaryBandsAndDepartments();
	}

}
