package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Student;
import com.nt.repository.StudentRepository;

@Service("studentOP")
public class StudentOperations implements IStudentService {
	@Autowired
	private StudentRepository sr;

	@Override
	public String addNewStudent(Student std) throws Exception {
		Student s = sr.save(std);
		return "One Student Data Sucessfully Added ID :: " + s.getId();
	}

	@Override
	public List<Student> findByAllStudent() throws Exception {
		List<Student> all = sr.findAll();
		return all;
	}

	@Override
	public Optional<Student> findByID(String Id) throws Exception {
		Optional<Student> byId = sr.findById(Id);
		return byId;
	}

	@Override
	public List<Student> findByCourse(String course) throws Exception {
		List<Student> all = sr.findAll();
		List<Student> courseStudents = new ArrayList<>();

		for (Student s : all) {
			if (s.getCourse() != null && s.getCourse().equalsIgnoreCase(course)) {
				courseStudents.add(s);
			}
		}
		return courseStudents;
	}

	@Override
	public List<Student> findByMarksGreaterThan(Integer marks) throws Exception {
		List<Student> all = sr.findAll();
		List<Student> aboveAll = new ArrayList<>();

		for (Student s : all) {
			if (s.getMarks() != null && s.getMarks() > marks) {
				aboveAll.add(s);
			}
		}

		return aboveAll;
	}

	@Override
	public String updateStudentById(String Id, int mark) throws Exception {
		Optional<Student> opt = sr.findById(Id);
		if (opt.isPresent()) {
			Student existing = opt.get();
			existing.setMarks(existing.getMarks() + mark);
			sr.save(existing);
			return "Student updated with ID :: " + Id;
		} else {
			return "Student not found with ID :: " + Id;
		}
	}

	@Override
	public String deleteStudentById(String Id) throws Exception {
		if (sr.existsById(Id)) {
			sr.deleteById(Id);
			return "Student deleted with ID :: " + Id;
		} else {
			return "Student not found with ID :: " + Id;
		}
	}

}
