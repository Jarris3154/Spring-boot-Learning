package com.jia.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.model.Person;
import com.jia.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/findAll")
    public List<Person> findAll() {
        //配置中的PageHelper是静态的，可以直接设置分页的当前页和每页的数目
        PageHelper.startPage(1,3);
        List<Person> list = personService.findAll();

        PageInfo pageInfo = new PageInfo(list);
        return personService.findAll();
    }

    @RequestMapping("/likeName")
    public List<Person> likeName(String name) {
        return personService.likeName(name);
    }

    @RequestMapping("/ids/{id}")
    public Person getById(@PathVariable int id) {
        return personService.getById(id);
    }

    @RequestMapping("/getNameById/{id}")
    public String getNameById(@PathVariable int id) {
        return personService.getNameById(id);
    }

    @RequestMapping("/error")
    public void error() throws Exception {
        throw new Exception("heal the error automaticlly");
    }

    @RequestMapping("/save")
    public Person save(){
        Person person = new Person();
        person.setName("jiage");
        person.setAge(25);
        personService.save(person);
        return person;
    }
}
