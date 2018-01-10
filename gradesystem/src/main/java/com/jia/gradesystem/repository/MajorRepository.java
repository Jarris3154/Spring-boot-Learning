package com.jia.gradesystem.repository;

import com.jia.gradesystem.model.Major;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MajorRepository extends MongoRepository<Major, String> {
}
