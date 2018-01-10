package com.jia.gradesystem.repository;

import com.jia.gradesystem.model.Clazz;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClazzRepository extends MongoRepository<Clazz, String> {
}
