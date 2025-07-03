package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbean.DiscountCalculator;

public class Main3 {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nit/cfgs/discountContext.xml");
		
		Object obj = ctx.getBean("p3");
		
		DiscountCalculator dis = (DiscountCalculator)obj;
		
		dis.calculateDiscount();
		
		ctx.close();
	}

}
