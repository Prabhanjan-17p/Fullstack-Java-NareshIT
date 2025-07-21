package com.nit.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbean.MessageConverter;

public class Main {
	public static void main(String[] args) {
		try {
	        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	        MessageConverter converter = context.getBean(MessageConverter.class);
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the message: ");
	        String message = scanner.nextLine();

	        System.out.println("Enter html to convert the message in html format");
	        System.out.println("Enter pdf to convert the message in pdf format");
	        System.out.print("Enter your choice: ");
	        String choice = scanner.nextLine();

	        String result = converter.msg(choice, message);
	        System.out.println("Output:");
	        System.out.println(result);

	        scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
