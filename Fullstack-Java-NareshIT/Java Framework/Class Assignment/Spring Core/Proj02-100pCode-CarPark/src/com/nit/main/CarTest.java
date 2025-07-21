package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbean.ParkingLot;

public class CarTest {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);) {
			ParkingLot p = ctx.getBean("parkingLot",ParkingLot.class);
			p.ParkingLot();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
