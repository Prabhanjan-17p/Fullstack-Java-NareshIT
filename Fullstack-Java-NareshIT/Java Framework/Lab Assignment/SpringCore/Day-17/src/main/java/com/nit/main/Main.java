package com.nit.main;

import java.time.LocalDate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbean.WeekDayFinder;

public class Main {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(AppConfig.class)){
			WeekDayFinder finder=ctx.getBean("wf", WeekDayFinder.class);
			System.out.println("result::"+finder.showGreetMessage("Wajahat"));
			
			LocalDate date=ctx.getBean("ldate2",LocalDate.class );
			System.out.println("Injected date::"+date);
		}
	}

}