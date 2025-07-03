package com.nit.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.sbean.WeekEndDay_Assignment;

public class DependencyInjectionAssignmentTest {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContextAssignment.xml");){
			WeekEndDay_Assignment find = ctx.getBean("weekdayendP1",WeekEndDay_Assignment.class);
			String name = find.showWeekDayEnd();
			System.out.println(name);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
