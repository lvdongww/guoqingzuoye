package com.kgc.controller;

import com.kgc.pojo.StudentInfo;
import com.kgc.service.StudentInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shkstart
 * @create 2020-10-01 22:38
 */
@Controller
public class StudentController {
    @Resource
    StudentInfoService studentInfoService;
    @RequestMapping("/")
    public String toSelect(){
        return "select";
    }
    @RequestMapping("chuan")
    public String toSelectId(Integer sid, Model model){
        StudentInfo studentInfo = studentInfoService.selId(sid);
        model.addAttribute("student",studentInfo);
        return "update";
    }
    @RequestMapping("update")
    public String update(StudentInfo st, HttpSession session){
        boolean upda = studentInfoService.upda(st);
        if (upda) {
            session.setAttribute("boo","修改成功");
        }else {
            session.setAttribute("boo","修改失败");
        }
        return "redirect:/";
    }
    @RequestMapping("selectAll")
    @ResponseBody
    public Map<String,Object> selectAll(){
        Map<String,Object> map=new HashMap<>();
        List<StudentInfo> sel = studentInfoService.sel();
        map.put("data",sel);
        return map;
    }
}
