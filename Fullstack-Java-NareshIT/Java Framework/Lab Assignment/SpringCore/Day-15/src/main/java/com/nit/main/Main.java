package com.nit.main;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;

public class Main {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
			Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter  language code ::");
			String lang = sc.next();

			System.out.println("Enter  country code ::");
			String country = sc.next();

			Locale locale = new Locale(lang, country);
			String msg1 = ctx.getMessage("welcome.message", new Object[] {}, "message1", locale);
			System.out.println(msg1);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
