package com.nit.cfgs;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*
 * We can fixed the Ambiguity using 3-different ways
 * 1- @Primary
 * 2- @Qulifier(-)
 * 3- Using HAS-A properties name under the @Bean(-) 
 */

@Configuration // Marks this class as a configuration class (like <beans> in XML)
@ComponentScan(basePackages = "com.nit.sbean") // Instructs Spring to scan only this package for components
public class AppConfig {

    public AppConfig() {
        System.out.println("AppConfig :: 0-parameter Constructor");
    }

//    @Bean("ldate") 
//    @Primary //1
    @Bean("date") //3- HAS-A relation
    public LocalDate createDate() {
        return LocalDate.now(); // Returns current date
    }
    
    @Bean("ldate2") 
//    @Primary
    public LocalDate createDate2() {
        return LocalDate.of(2020, 10, 24); // Returns current date
    }

}

