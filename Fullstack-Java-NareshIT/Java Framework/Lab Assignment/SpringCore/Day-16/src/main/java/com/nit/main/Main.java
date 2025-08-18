package com.nit.main;

import java.util.Locale;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.model.Actor;

public class Main {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);){
			  Actor actor = ctx.getBean(Actor.class);
			  
			  actor.display();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
