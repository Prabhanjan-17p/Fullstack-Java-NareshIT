package com.nit.sbean;

import org.springframework.stereotype.Component;

@Component("exc")
public class Excel implements ReportService{

	@Override
	public void generateReports() {
		System.out.println("Generate Reports via Excel!!");
	}

}
