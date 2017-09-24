package com.jia.service;

import com.jia.dao.PersonDao;
import com.jia.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

    public List<Person> findAll(){
        return personDao.findAll();
    }
    public List<Person> likeName(String name){
        return personDao.likeName(name);
    }

    public String getNameById(int id){
        return personDao.getNameById(id);
    }

    public Person getById(int id){
        return personDao.getById(id);
    }

    @Transactional
    public void save(Person person){
        personDao.save(person);
    }
}
