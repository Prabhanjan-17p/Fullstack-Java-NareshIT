package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbean.CricketMatch;

public class CricketTest {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);) {
			CricketMatch mtc = ctx.getBean("match",CricketMatch.class);
			mtc.startMatch();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
