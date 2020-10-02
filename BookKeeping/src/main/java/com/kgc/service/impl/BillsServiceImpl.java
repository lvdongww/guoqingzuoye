package com.kgc.service.impl;

import com.kgc.mapper.BillsMapper;
import com.kgc.pojo.Bills;
import com.kgc.service.BillsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-02 15:00
 */
@Service
public class BillsServiceImpl implements BillsService {
    @Resource
    BillsMapper billsMapper;
    @Override
    public List<Bills> select(Integer typeId, String kai, String jie) {
        return billsMapper.selectAll(typeId,kai,jie);
    }

    @Override
    public int add(Bills bills) {
        return billsMapper.insertSelective(bills);
    }
}
