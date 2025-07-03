package com.nit.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbean.StudentConstructor;

public class StudentMarksUser {

	public static void main(String[] args) {
		try {
//			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
			
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContextConstructor.xml");

			
//			Student s1 =(Student)context.getBean("studentP1");
			
			StudentConstructor s1 =(StudentConstructor)context.getBean("studentCon");
			
			if (s1.getResult() == 1) {
				System.out.println(s1);
			}else {
				System.out.println(s1);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
