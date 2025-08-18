package com.nt.service;

import java.time.LocalDate;
import java.util.List;

import com.nt.entity.Student;

public interface IServiceStudent {
	public String insertStudentDetails(String name, String email, String course, LocalDate ldate) throws Exception;

	public List<Student> fetchAllDetals() throws Exception;

	public String updateDetails(String name, String email, String course, long id) throws Exception;

	public String deleteDetails(long id) throws Exception;

	public List<Student> searchByName(String name) throws Exception;
}
