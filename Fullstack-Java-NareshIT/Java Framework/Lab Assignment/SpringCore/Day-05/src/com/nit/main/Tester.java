package com.nit.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.sbean.Account;

public class Tester {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");){
			Account ac = ctx.getBean("CP2",Account.class);
			System.out.println("\t\t----------------After getting the object----------------");
			System.out.println(ac);
			System.out.println();
			
			System.out.println("\t\t----------------After deposite---------------- ");
			ac.deposit(4000);
			System.out.println(ac);
			System.out.println();
			
			System.out.println("\t\t----------------After withdraw---------------- ");
			ac.withdraw(2000);
			System.out.println(ac);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
