package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbean.ElectricityBillGenerator;

public class Main4 {
	public static void main(String[] args) {
		try(FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nit/cfgs/electricbillContext.xml");){
			ElectricityBillGenerator bill = (ElectricityBillGenerator) ctx.getBean("p4");
			
			double tot =  bill.generateBill();
			
			System.out.println("Total Electricity Bill: "+tot);
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}
}
