package com.nit.main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbean.Student;

@Configuration
@ComponentScan(basePackages = "com.nit.sbean")
public class Main3 {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main3.class)) {
            Student student = context.getBean("std",Student.class);
            student.visitLibrary();
        }
    }
}