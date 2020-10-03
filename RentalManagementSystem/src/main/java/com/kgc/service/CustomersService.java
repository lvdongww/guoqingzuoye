package com.kgc.service;

import com.kgc.pojo.Customers;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-02 18:44
 */
public interface CustomersService {
    List<Customers> selectAll();
    int add(Customers customers);
    int delete(Integer id);
}
