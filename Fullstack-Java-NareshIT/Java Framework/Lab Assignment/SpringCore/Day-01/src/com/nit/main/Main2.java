package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbean.WishMessageGenerator;

public class Main2 {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nit/cfgs/wishContext.xml");
		
		Object obj = ctx.getBean("p2");
		
		WishMessageGenerator wishh = (WishMessageGenerator)obj;
		
		wishh.printgenerateWishMessage();
		
		ctx.close();
	}

}
