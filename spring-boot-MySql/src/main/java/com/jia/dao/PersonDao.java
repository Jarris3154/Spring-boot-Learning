package com.jia.dao;

import com.jia.model.Person;
import com.jia.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Service
public class PersonDao {

    @Autowired
    private PersonRepository personRepository;

    public Iterable<Person> findAll() {
        return personRepository.findAll();
    }

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public void deleteById(int id) {
        personRepository.deleteById(id);
    }

    public Iterable<Person> findByName(String name){
        return personRepository.findByName(name);
    }

    public Iterable<Person> findByQuery(@Param("age")int age){
        return personRepository.findByQuery(age);
    }
}
