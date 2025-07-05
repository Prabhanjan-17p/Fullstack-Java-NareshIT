package com.nit.cfgs;

import java.time.LocalDate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
    ✅ What is Spring?
    - Spring is a lightweight framework for building Java-based enterprise applications.
    - Core features include Dependency Injection (DI), Aspect-Oriented Programming (AOP), and support for MVC.
    - Makes development easier, modular, and testable.

    ✅ Why Spring?
    - Loose coupling using DI
    - Reduces boilerplate code
    - Easy integration with other frameworks
    - Built-in support for annotations, transactions, JDBC, JPA, and more.

    ✅ Key Annotations:
    - @Configuration: Declares this class as a source of Spring bean definitions (like XML-based config).
    - @ComponentScan: Tells Spring where to look for components (@Component, @Service, @Repository, etc.).
    - @Bean: Used to manually define a bean that Spring will manage.
    
    
    // 🔍 Summary:
    // - @Configuration → Marks class as config source for Spring
    // - @ComponentScan → Enables component scanning for dependency injection
    // - @Bean → Declares individual bean definitions inside Java class (replaces XML <bean>)
*/

@Configuration // Marks this class as a configuration class (like <beans> in XML)
@ComponentScan(basePackages = "com.nit.sbean") // Instructs Spring to scan only this package for components
public class AppConfig {

    public AppConfig() {
        System.out.println("AppConfig :: 0-parameter Constructor");
    }

    @Bean("ldate") 
    // Creates a Spring bean with ID "ldate", equivalent to: <bean id="ldate" class="java.time.LocalDate" />
    // Used when you want to manually declare a bean (especially for third-party or JDK classes)
    public LocalDate createDate() {
        return LocalDate.now(); // Returns current date
    }

}

