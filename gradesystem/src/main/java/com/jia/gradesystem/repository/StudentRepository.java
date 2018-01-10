package com.jia.gradesystem.repository;

import com.jia.gradesystem.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String>{
}
