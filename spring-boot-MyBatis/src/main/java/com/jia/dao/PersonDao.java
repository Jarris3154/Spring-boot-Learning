package com.jia.dao;

import com.jia.mapper.PersonMapper;
import com.jia.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonDao {

    @Autowired
    private PersonMapper personMapper;

    public List<Person> findAll() {
        return personMapper.findAll();
    }

    public String getNameById(int id) {
        return personMapper.getNameById(id);
    }

    public List<Person> likeName(String name) {
        return personMapper.likeName(name);
    }

    public Person getById(int id) {
        return personMapper.getById(id);
    }

    public void save(Person person) {
        personMapper.save(person);
    }
}
