package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbean.VehicleWorkshop;

public class Main2 {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);) {
			VehicleWorkshop v =  ctx.getBean(VehicleWorkshop.class);
			v.callService();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
