package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.service.MailService;

@SpringBootApplication
public class Day08Application {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext run = SpringApplication.run(Day08Application.class, args);) {
			MailService bean = run.getBean(MailService.class);
			String sendMail = bean.sendMails("pravanjanamanta@gmail.com", "Assignment Day-08 for testing.", "Here it is testing purpose nothing else thank you.");
			System.out.println(sendMail);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
