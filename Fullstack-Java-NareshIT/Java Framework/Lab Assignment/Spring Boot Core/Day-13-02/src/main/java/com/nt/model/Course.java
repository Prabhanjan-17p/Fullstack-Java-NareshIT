package com.nt.model;

import java.time.Duration;
import java.util.List;

import lombok.Data;

@Data
public class Course {
	private String title;
	private Duration duration; 
	private String instructor;
	private double price;
	private List<String> tags; 
}
