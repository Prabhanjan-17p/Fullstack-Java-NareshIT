package com.nt.model;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
@ConfigurationProperties(prefix = "courseplatform")
public class CoursePlatformProperties {
    private String platformName;
    private String defaultLanguage;
    private double subscriptionFee;
    private boolean active;

    private List<String> supportedLanguages;

    private Map<String, Integer> storageLimits;

    private Course defaultCourse;

    private List<Course> courses;

    private Map<String, Instructor> instructorDirectory;
}
