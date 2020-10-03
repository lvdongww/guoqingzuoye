package com.kgc.service.impl;

import com.kgc.mapper.CustomersMapper;
import com.kgc.pojo.Customers;
import com.kgc.service.CustomersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-02 18:44
 */
@Service
public class CustomersServiceImpl implements CustomersService {
    @Resource
    CustomersMapper customersMapper;
    @Override
    public List<Customers> selectAll() {
        return customersMapper.selectAll();
    }

    @Override
    public int add(Customers customers) {
        return customersMapper.insertSelective(customers);
    }
    @Override
    public int delete(Integer id) {
        return customersMapper.deleteByPrimaryKey(id);
    }
}
