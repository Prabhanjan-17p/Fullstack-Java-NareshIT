package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.nt.model.QNS2;

@SpringBootApplication
@EnableScheduling
public class Day05Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Day05Application.class, args);
		
		QNS2 report2 = ctx.getBean(QNS2.class);
		report2.runTask();
	}

}
