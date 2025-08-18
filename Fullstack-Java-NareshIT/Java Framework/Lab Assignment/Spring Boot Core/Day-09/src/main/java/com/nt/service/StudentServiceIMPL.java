package com.nt.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.nt.dao.IStudentDAO;
import com.nt.entity.Student;

@Service("stdSer")
//@Component
public class StudentServiceIMPL implements IServiceStudent {
	@Autowired
	private IStudentDAO std;

	@Override
	public String insertStudentDetails(String name, String email, String course, LocalDate ldate) throws Exception {
		email = email.toLowerCase();
		int ins = std.insertStudentDetails(name, email, course, ldate);
		return ins==1?"Insert Sucessfully":"Not Insert error!!";
	}

	@Override
	public List<Student> fetchAllDetals() throws Exception {
		List<Student> list = std.fetchAllDetals();
		return list;
	}

	@Override
	public String updateDetails(String name, String email, String course, long id) throws Exception {
		email = email.toLowerCase();
		int upd = std.updateDetails(name, email, course, id);
		return upd==1?"Update sucessfully":"Not Update!!";
	}

	@Override
	public String deleteDetails(long id) throws Exception {
		int del = std.deleteDetails(id);
		return del==1?"Delete data sucessfully":"Not Delete";
	}

	@Override
	public List<Student> searchByName(String name) throws Exception {
		List<Student> list = std.searchByName(name);
		return list;
	}

}
