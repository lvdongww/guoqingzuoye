package com.kgc.service;

import com.kgc.pojo.StudentInfo;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-01 22:39
 */
public interface StudentInfoService {
    List<StudentInfo> sel();
    boolean upda(StudentInfo st);
     StudentInfo selId(Integer sid);
}
