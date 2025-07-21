package com.nit.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ReportGenerator {
	private ReportService rep;

	@Autowired
//	public ReportGenerator(@Qualifier("pdf") ReportService rep) {
	public ReportGenerator(@Qualifier("exc") ReportService rep) {
		super();
		this.rep = rep;
	}

	public void callReport() {
		rep.generateReports();
	}
}
