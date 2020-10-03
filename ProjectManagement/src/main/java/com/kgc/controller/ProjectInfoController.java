package com.kgc.controller;

import com.github.pagehelper.PageInfo;
import com.kgc.pojo.ProjectInfo;
import com.kgc.service.ProjectInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author shkstart
 * @create 2020-10-03 15:41
 */
@Controller
public class ProjectInfoController {
    @Resource
    ProjectInfoService projectInfoService;
    @RequestMapping("/")
    public String toIndex(){
        return "index";
    }
    @RequestMapping("select")
    @ResponseBody
    public Map<String,Object> toIndex(Integer pageSize,Integer pageIndex,Integer status){
        Map<String,Object> map=new HashMap<>();
        PageInfo<ProjectInfo> projectInfoPageInfo = projectInfoService.selectByType(pageIndex, pageSize, status);
        map.put("data",projectInfoPageInfo);
        return map;
    }
    @RequestMapping("chuan")
    public String chuan(Integer id, Model model){
        ProjectInfo projectInfo = projectInfoService.selectById(id);
        model.addAttribute("projectinfo",projectInfo);
        return "index2";
    }
    @RequestMapping("update")
    public String update(ProjectInfo projectInfo){
        projectInfoService.update(projectInfo);
        return "redirect:/";
    }
}
