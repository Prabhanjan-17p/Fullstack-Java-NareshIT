package com.nt.dao;

import java.time.LocalDate;
import java.util.List;

import com.nt.entity.Student;

public interface IStudentDAO {
	public int insertStudentDetails(String name, String email,String course,LocalDate ldate) throws Exception;
	public List<Student> fetchAllDetals()throws Exception;
	public int updateDetails(String name, String email,String course,long id) throws Exception;
	public int deleteDetails(long id) throws Exception;
	public List<Student> searchByName(String name) throws Exception;
}
