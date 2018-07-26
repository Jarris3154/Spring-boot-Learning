package com.jia.demo.model;

/**
 * Created by Jarris on 7/26/2018.
 */
public class User {
    private final String id;
    private final String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}