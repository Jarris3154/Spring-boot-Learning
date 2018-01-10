package com.jia.gradesystem.repository;

import com.jia.gradesystem.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String>{
    User findByUsername(String username, String password);
}
