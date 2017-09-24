package com.jia.mapper;

import com.jia.model.Person;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PersonMapper {

    @Select("select * from Person")
    List<Person> findAll();

    //#{name}:参数占位符
    @Select("select * from Person where name like CONCAT(CONCAT('%', #{name}), '%')")
    List<Person> likeName(String name);

    @Select("select * from Person where id=#{id}")
    Person getById(int id);

    @Select(("select name from Person where id=#{id}"))
    String getNameById(int id);

    @Insert(("insert into person(name,age) values(#{name},#{age})"))
    @Options(useGeneratedKeys = true, keyColumn = "id")
    //设置自动获取自增长id
    void save(Person person);
}

