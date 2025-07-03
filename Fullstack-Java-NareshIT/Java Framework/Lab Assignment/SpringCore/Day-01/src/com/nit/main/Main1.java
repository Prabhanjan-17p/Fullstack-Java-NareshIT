package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbean.DatePrinter;

public class Main1 {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nit/cfgs/applicationContext.xml");
		
		Object obj = ctx.getBean("p1");
		
		DatePrinter date = (DatePrinter)obj;
		
		date.printDate();
		
		ctx.close();

	}

}
