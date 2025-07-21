package com.nit.sbean;

import org.springframework.stereotype.Component;

@Component("pdf")
public class PDF  implements ReportService{

	@Override
	public void generateReports() {
		System.out.println("Generate Reports via PDF!!");
	}

}
