package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.cfgs.AppConfig;
import com.nit.sbean.WeekEndDay;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);){
			WeekEndDay week = ctx.getBean("wf",WeekEndDay.class); //it's not .class file it's Object.java.lang.class object which is provide about all details or meta data about this AppConfig class  
			System.out.println(week.greetMSG("Kanha"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
