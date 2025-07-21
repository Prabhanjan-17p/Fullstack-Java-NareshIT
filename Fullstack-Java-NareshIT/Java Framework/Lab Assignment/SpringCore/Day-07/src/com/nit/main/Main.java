package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbean.Notifier;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
            Notifier notifier = ctx.getBean(Notifier.class);
            notifier.notifyUser("Welcome to Spring Constructor Injection!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
