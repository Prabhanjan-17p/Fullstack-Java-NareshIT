package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.service.ServiceCenter;

@SpringBootApplication
public class Day1502Application {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext context = SpringApplication.run(Day1502Application.class, args);){
		
		ServiceCenter bean = context.getBean(ServiceCenter.class);
		
		bean.performService();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
