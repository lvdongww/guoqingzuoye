package com.kgc.service;

import com.kgc.pojo.Person;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-01 23:18
 */
public interface PersonService {
    List<Person> selectAll();
    int add(Person person);
}
