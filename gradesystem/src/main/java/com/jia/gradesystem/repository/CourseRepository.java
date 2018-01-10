package com.jia.gradesystem.repository;

import com.jia.gradesystem.model.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course, String>{
}
