package com.nit.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.sbean.PaymentProcessor;

public class Main {

	public static void main(String[] args) {	
		   ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");

	        PaymentProcessor processor = (PaymentProcessor)ctx.getBean("payProcessor");
	        
	        processor.makePay();

	        ctx.close();
	}

}
