package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.cfgs.AppConfig;
import com.nit.sbean.Laucher;

public class Main {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);){
			Laucher lal = ctx.getBean(Laucher.class);
			lal.launch();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
