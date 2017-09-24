package com.jia.controller;

import com.jia.model.Person;
import com.jia.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/findAll")
    public Iterable<Person> findAll() {
        return personService.findALl();
    }

    //使用Hibernate规则首字母大写来查询
    @RequestMapping("/:name")
    public Iterable<Person> findByName(@PathVariable String name) {
        return personService.findByName(name);
    }

    //通过JPQL语句自定义查询，在repository加入@Query(类似HQL语句)
    @RequestMapping("/query")
    public Iterable<Person> findByQuery(int age) {
        return personService.findByQuery(age);
    }

    @RequestMapping("/delete")
    public void delete(String id) {
        personService.delete(1);
    }

    @RequestMapping("/save")
    public Person save() {
        Person person = new Person();
        person.setAge(25);
        person.setName("jia");
        return personService.save(person);
    }

    @RequestMapping("/error")
    public void error() throws Exception {
        throw new Exception("hea");
    }

}
