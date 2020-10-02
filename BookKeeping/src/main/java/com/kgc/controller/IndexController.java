package com.kgc.controller;

import com.kgc.pojo.BillType;
import com.kgc.pojo.Bills;
import com.kgc.service.BillTypeService;
import com.kgc.service.BillsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-02 14:57
 */
@Controller
public class IndexController {
    @Resource
    BillsService billsService;
    @Resource
    BillTypeService billTypeService;
    @RequestMapping("/")
    public String toIndex(Integer typeId, String kai, String jie, HttpSession session){
        List<Bills> select = billsService.select(typeId, kai, jie);
        List<BillType> billTypes = billTypeService.selectAll();
        session.setAttribute("select",select);
        session.setAttribute("billType",billTypes);
        return "select";
    }
    @RequestMapping("toAdd")
    public String toAdd(){
        return "add";
    }
    @RequestMapping("add")
    public String add(Bills bills){

       billsService.add(bills);
        return "redirect:/";
    }
}
