package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbean.Notifier;
import com.nit.sbean.ReportGenerator;
import com.nit.sbean.ReportService;

public class Main2 {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
            ReportGenerator rg = ctx.getBean(ReportGenerator.class);
            rg.callReport();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
