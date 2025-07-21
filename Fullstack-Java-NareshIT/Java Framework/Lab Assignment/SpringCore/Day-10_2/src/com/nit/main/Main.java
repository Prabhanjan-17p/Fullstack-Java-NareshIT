package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbean.LoanProcessor;

public class Main {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);) {
			LoanProcessor loanProcessor = ctx.getBean(LoanProcessor.class);
			loanProcessor.processLoan(12000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
