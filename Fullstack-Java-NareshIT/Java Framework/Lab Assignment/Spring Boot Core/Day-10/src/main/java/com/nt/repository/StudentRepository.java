package com.nt.repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nt.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
    List<Student> findByCourse(String course);
    List<Student> findByMarksGreaterThan(Integer marks);
}

