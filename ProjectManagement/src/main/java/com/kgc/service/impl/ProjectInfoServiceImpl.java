package com.kgc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.mapper.ProjectInfoMapper;
import com.kgc.pojo.ProjectInfo;
import com.kgc.pojo.ProjectInfoExample;
import com.kgc.service.ProjectInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-03 15:34
 */
@Service
public class ProjectInfoServiceImpl implements ProjectInfoService {
    @Resource
    ProjectInfoMapper projectInfoMapper;
    @Override
    public PageInfo<ProjectInfo> selectByType(Integer pageIndex, Integer pageSize, Integer status) {
        ProjectInfoExample projectInfoExample=new ProjectInfoExample();
        ProjectInfoExample.Criteria criteria = projectInfoExample.createCriteria();
        projectInfoExample.setOrderByClause("startdate desc");
        if (status!=3){
            criteria.andStatusEqualTo(status);
        }
        PageHelper.startPage(pageIndex,pageSize);
        List<ProjectInfo> projectInfos = projectInfoMapper.selectByExample(projectInfoExample);
        PageInfo<ProjectInfo> pageInfo=new PageInfo<>(projectInfos);
        return pageInfo;
    }

    @Override
    public int update(ProjectInfo projectInfo) {
        return projectInfoMapper.updateByPrimaryKeySelective(projectInfo);
    }

    @Override
    public ProjectInfo selectById(Integer id) {
        return projectInfoMapper.selectByPrimaryKey(id);
    }

}
