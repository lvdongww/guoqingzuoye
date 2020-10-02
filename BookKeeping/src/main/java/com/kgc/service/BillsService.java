package com.kgc.service;

import com.kgc.pojo.Bills;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-02 14:59
 */
public interface BillsService {
    List<Bills> select(Integer typeId, String kai, String jie);

    int add(Bills bills);
}
