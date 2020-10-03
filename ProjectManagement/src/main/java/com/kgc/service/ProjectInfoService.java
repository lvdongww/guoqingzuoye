package com.kgc.service;

import com.github.pagehelper.PageInfo;
import com.kgc.pojo.ProjectInfo;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-03 15:34
 */
public interface ProjectInfoService {
    PageInfo<ProjectInfo> selectByType(Integer pageIndex, Integer pageSize, Integer status);
    int update(ProjectInfo projectInfo);
    ProjectInfo selectById(Integer id);
}
