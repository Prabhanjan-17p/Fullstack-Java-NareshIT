package com.nit.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.sbean.Cake;
import com.nit.sbean.OrderCake;

public class CakeOrderApplication {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");){

			OrderCake c1 = ctx.getBean("CakeP1",OrderCake.class);
			OrderCake c2 = ctx.getBean("CakeP2",OrderCake.class);
			OrderCake c3 = ctx.getBean("CakeP3",OrderCake.class);
			String order1 = c1.getOrder();
			String order2 = c2.getOrder();
			String order3 = c3.getOrder();
			System.out.println(order1);
			System.out.println("----------------------------");
			System.out.println(order2);
			System.out.println("----------------------------");
			System.out.println(order3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
