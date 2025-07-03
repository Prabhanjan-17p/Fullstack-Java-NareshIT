package com.nit.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.sbean.WishMessageGenerator;

public class Main2 {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cfgs/wishMSGContext.xml");){

			WishMessageGenerator wish = (WishMessageGenerator)ctx.getBean("timeWish");
			
			String msg = wish.generateWishMessage();
			
			System.out.println(msg);	
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
