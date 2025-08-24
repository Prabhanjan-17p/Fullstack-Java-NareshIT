package com.nt.service;

import org.springframework.stereotype.Service;

import com.nt.model.Course;
import com.nt.model.CoursePlatformProperties;
import com.nt.model.Instructor;

@Service
public class CoursePlatformService {
	private final CoursePlatformProperties properties;

	public CoursePlatformService(CoursePlatformProperties properties) {
		this.properties = properties;
	}
	
	public void printDefaultCourse() {
        Course c = properties.getDefaultCourse();
        System.out.println("--- Default Course ---");
        System.out.println("Title: " + c.getTitle());
        System.out.println("Duration: " + c.getDuration());
        System.out.println("Instructor: " + c.getInstructor());
        System.out.println("Price: " + c.getPrice());
    }

    public void listSupportedLanguages() {
        System.out.println("\n--- Supported Languages ---");
        properties.getSupportedLanguages().forEach(System.out::println);
    }

    public void listAllCourses() {
        System.out.println("\n--- Courses ---");
        for (Course c : properties.getCourses()) {
            System.out.println("Title: " + c.getTitle() + ", Duration: " + c.getDuration() + ", Price: " + c.getPrice());
        }
    }

    public void listInstructors() {
        System.out.println("\n--- Instructors ---");
        for (Instructor i : properties.getInstructorDirectory().values()) {
            System.out.println("Name: " + i.getName() + ", Expertise: " + i.getExpertise() + ", Rating: " + i.getRating());
        }
    }
}
