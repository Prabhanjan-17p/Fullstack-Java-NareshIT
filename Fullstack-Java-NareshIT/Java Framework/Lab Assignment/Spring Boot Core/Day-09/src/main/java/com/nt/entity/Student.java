package com.nt.entity;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Student {
	private Long id;
	private String name;
	private String email;
	private String course;
	private LocalDate registrationDate;
}
