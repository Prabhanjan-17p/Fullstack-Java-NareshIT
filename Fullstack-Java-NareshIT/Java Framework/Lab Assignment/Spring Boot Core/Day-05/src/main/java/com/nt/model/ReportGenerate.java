package com.nt.model;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("report")
public class ReportGenerate {
	
	@Scheduled(fixedRate = 5000)
	public void generateReport() {
		System.out.println("Start on SaleReport :: "+new Date());
//		try {
//			Thread.sleep(5000);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		System.out.println("End Sales Report on :: "+new Date());
	}
}
