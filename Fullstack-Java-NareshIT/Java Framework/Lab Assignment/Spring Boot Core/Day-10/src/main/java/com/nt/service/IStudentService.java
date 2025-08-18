package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.model.Student;

public interface IStudentService {
	public String addNewStudent(Student std) throws Exception;
	List<Student> findByAllStudent()throws Exception;
	Optional<Student> findByID(String Id)throws Exception;
    List<Student> findByCourse(String course)throws Exception;
    List<Student> findByMarksGreaterThan(Integer marks)throws Exception;
    public String updateStudentById(String Id,int mark) throws Exception;
    public String deleteStudentById(String Id) throws Exception;
}
