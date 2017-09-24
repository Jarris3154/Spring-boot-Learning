package com.jia.controller;

import com.github.pagehelper.PageHelper;
import com.jia.model.Person;
import com.jia.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/rest/v1/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(method=RequestMethod.GET)
    public List<Person> findAll() {
        //配置中的PageHelper是静态的，可以直接设置分页的当前页和每页的数目
        PageHelper.startPage(1,3);

        return personService.findAll();
    }

    @RequestMapping("/likeName")
    public List<Person> likeName(String name) {
        return personService.likeName(name);
    }

    @RequestMapping("/{id}")
    public Person getById(@PathVariable int id) {
        return personService.getById(id);
    }

    @RequestMapping("{id}/getName")
    public String getNameById(@PathVariable int id) {
        return personService.getNameById(id);
    }

    @RequestMapping("/error")
    public void error() throws Exception {
        throw new Exception("heal the error automaticlly");
    }

    @RequestMapping(method=RequestMethod.POST)
    public Person save(@RequestBody Person person){
        personService.save(person);
        return person;
    }
}
