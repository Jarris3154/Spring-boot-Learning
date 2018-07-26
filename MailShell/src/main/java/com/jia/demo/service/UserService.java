package com.jia.demo.service;

import com.jia.demo.model.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jarris on 7/26/2018.
 */
public class UserService {
    private final Map<String, User> users = new HashMap<>();

    public UserService() {
        users.put("alex", new User("alex", "Alex"));
        users.put("bob", new User("bob", "Bob"));
    }

    public User findUser(String id) {
        return users.get(id);
    }
}
