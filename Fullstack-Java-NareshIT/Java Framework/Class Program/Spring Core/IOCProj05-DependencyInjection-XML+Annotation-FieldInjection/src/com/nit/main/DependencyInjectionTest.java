package com.nit.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.sbean.SeasonFinder;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");){
			SeasonFinder find = ctx.getBean("seasonP1",SeasonFinder.class);
			String name = find.showSeason();
			System.out.println(name);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
