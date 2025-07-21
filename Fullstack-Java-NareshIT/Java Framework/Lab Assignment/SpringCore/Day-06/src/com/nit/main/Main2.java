package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbean.Car;


@Configuration
@ComponentScan(basePackages = "com.nit.sbean")
public class Main2 {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Main2.class);){
			Car car = ctx.getBean("c1",Car.class);
			car.drive();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
