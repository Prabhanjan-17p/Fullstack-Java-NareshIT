package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbean.A;
import com.nt.sbean.B;

public class CyclicInjectionTest {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		A aa = (A)ctx.getBean("a1");
		System.out.println("a :: "+aa);
		
		System.out.println("=======================");
		
		B bb = (B)ctx.getBean("b1");
		System.out.println("b :: "+bb);

	}

}
