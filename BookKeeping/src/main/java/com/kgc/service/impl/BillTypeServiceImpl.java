package com.kgc.service.impl;

import com.kgc.mapper.BillTypeMapper;
import com.kgc.pojo.BillType;
import com.kgc.service.BillTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-02 15:00
 */
@Service
public class BillTypeServiceImpl implements BillTypeService {
    @Resource
    BillTypeMapper billTypeMapper;
    @Override
    public List<BillType> selectAll() {
        return billTypeMapper.selectByExample(null);
    }
}
