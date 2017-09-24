package com.jia.controller;

import com.jia.model.Person;
import com.jia.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rest/v1/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(method= RequestMethod.GET)
    public Iterable<Person> findAll() {
        return personService.findAll();
    }

    //使用Hibernate规则首字母大写来查询
    @RequestMapping(value="/findByName/{name}",method= RequestMethod.GET)
    public Iterable<Person> findByName(@PathVariable String name) {
        return personService.findByName(name);
    }

    //通过JPQL语句自定义查询，在repository加入@Query(类似HQL语句)
    @RequestMapping(value="/query",method= RequestMethod.GET)
    public Iterable<Person> findByQuery(int age) {
        return personService.findByQuery(age);
    }

    @RequestMapping(value="/{id}",method= RequestMethod.DELETE)
    public void deleteById(@PathVariable int id) {
        personService.deleteById(id);
    }

    @RequestMapping("/error")
    public void error() throws Exception {
        throw new Exception("hea");
    }

    @RequestMapping(method=RequestMethod.POST)
    public Person save(@RequestBody Person person){
        personService.save(person);
        return person;
    }
}
