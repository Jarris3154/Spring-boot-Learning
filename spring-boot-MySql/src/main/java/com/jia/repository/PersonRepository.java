package com.jia.repository;

import com.jia.model.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.annotation.Resource;

@Resource
public interface PersonRepository extends CrudRepository<Person, Integer> {

    Iterable<Person> findAll();

    Person save(Person person);

    Person delete(int id);

    Iterable<Person> findByName(String name);

    /**
     *
     * 编写JPQL语句
     * 其和Hibernate的HQL语句是类似的
     *
     */
    @Query("from Person where age=:age")
    Iterable<Person> findByQuery(@Param("age") int age);

}
