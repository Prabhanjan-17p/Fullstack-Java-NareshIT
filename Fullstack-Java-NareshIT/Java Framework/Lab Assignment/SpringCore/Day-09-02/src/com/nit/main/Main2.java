package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.finance.ProfitLoss;
import com.nit.config.AppConfig2;

public class Main2 {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig2.class);){
			ProfitLoss pl = ctx.getBean(ProfitLoss.class);
			pl.calculateProfit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}