package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.book.Library;
import com.nit.config.AppConfig3;

public class Main3 {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig3.class);){
			Library lib = ctx.getBean(Library.class);
			lib.showBook();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}