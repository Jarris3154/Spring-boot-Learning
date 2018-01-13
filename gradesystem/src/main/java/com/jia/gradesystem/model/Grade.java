package com.jia.gradesystem.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.LinkedList;
import java.util.List;

@Document(collection = "grades")
public class Grade {
    @Id
    private String id;
    private String name;

    private List<Clazz> clazzList = new LinkedList<>(); //年级下的班级列表

    private List<Course> courseList = new LinkedList<>(); //本年级的课程

    private List<Student> studentList = new LinkedList<>(); //年级下的学生

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
