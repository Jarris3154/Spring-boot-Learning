package com.jia.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 使用@Entity进行实体类的持久化操作
 * JPA检测到我们的是实体类中有@Entity的注解时，自动生成表结构
 */
@Entity
public class Person {
    /**
     * 使用@Id决定主键
     * 使用@GeneratedValue指定id的生成策略，mysql默认的是自增长
     */
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
