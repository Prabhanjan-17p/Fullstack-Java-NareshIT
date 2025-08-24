package com.nt.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.CoursePlatformService;


@Component
public class TestRunner implements CommandLineRunner {
	private final CoursePlatformService service;

    public TestRunner(CoursePlatformService service) {
        this.service = service;
    }

    @Override
    public void run(String... args) throws Exception {
        service.printDefaultCourse();
        service.listSupportedLanguages();
        service.listAllCourses();
        service.listInstructors();
    }

}
