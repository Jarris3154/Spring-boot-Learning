package com.jia.service;

import com.jia.dao.PersonDao;
import com.jia.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

    public Iterable<Person> findAll(){
        return personDao.findAll();
    }
    public Iterable<Person> findByName(String name){
        return personDao.findByName(name);
    }

    public Iterable<Person> findByQuery(int age){
        return personDao.findByQuery(age);
    }
    @Transactional
    public Person save(Person person){
        return personDao.save(person);
    }
    @Transactional
    public void deleteById(int id){
        personDao.deleteById(id);
    }
}
