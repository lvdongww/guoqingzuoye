package com.kgc.service.impl;

import com.kgc.mapper.PersonMapper;
import com.kgc.pojo.Person;
import com.kgc.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-01 23:18
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Resource
    PersonMapper personMapper;
    @Override
    public List<Person> selectAll() {
        return personMapper.selectByExample(null);
    }

    @Override
    public int add(Person person) {
        return personMapper.insertSelective(person);
    }
}
