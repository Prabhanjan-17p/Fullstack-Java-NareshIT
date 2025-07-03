package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMSGGanerator;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		Object obj = ctx.getBean("wmg");
		
		WishMSGGanerator wish = (WishMSGGanerator)obj;
		
		String res = wish.generateMSG("Kanha");
		
		System.out.println(res);
		
		ctx.close();
	}
}
