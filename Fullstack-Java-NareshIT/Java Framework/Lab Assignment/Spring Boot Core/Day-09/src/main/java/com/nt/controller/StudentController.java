package com.nt.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.nt.entity.Student;
import com.nt.service.IServiceStudent;

@Controller("stdCon")
//@Component
public class StudentController {
	@Autowired
	private IServiceStudent std;
	
	public String insertStudentDetails(String name, String email, String course, LocalDate ldate) throws Exception {
		email = email.toLowerCase();
		String ins = std.insertStudentDetails(name, email, course, ldate);
		return ins;
	}
	
	public List<Student> fetchAllDetals() throws Exception {
		List<Student> list = std.fetchAllDetals();
		return list;
	}

	public String updateDetails(String name, String email, String course, long id) throws Exception {
		email = email.toLowerCase();
		String upd = std.updateDetails(name, email, course, id);
		return upd;
	}

	public String deleteDetails(long id) throws Exception {
		String del = std.deleteDetails(id);
		return del;
	}

	public List<Student> searchByName(String name) throws Exception {
		List<Student> list = std.searchByName(name);
		return list;
	}
}
