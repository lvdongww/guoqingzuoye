package com.kgc.service.impl;

import com.kgc.mapper.StudentInfoMapper;
import com.kgc.pojo.StudentInfo;
import com.kgc.pojo.StudentInfoExample;
import com.kgc.service.StudentInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-01 22:39
 */
@Service
public class StudentInfoServiceImpl implements StudentInfoService {
    @Resource
    StudentInfoMapper studentInfoMapper;
    @Override
    public List<StudentInfo> sel() {
        return studentInfoMapper.selectByExample(null);
    }

    @Override
    public boolean upda(StudentInfo st) {
        return studentInfoMapper.updateByPrimaryKeySelective(st)>0;
    }

    @Override
    public StudentInfo selId(Integer sid) {
        return studentInfoMapper.selectByPrimaryKey(sid);
    }
}
