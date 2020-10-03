package com.kgc.controller;

import com.kgc.pojo.Customers;
import com.kgc.service.CredentialtypeService;
import com.kgc.service.CustomersService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shkstart
 * @create 2020-10-02 18:44
 */
@Controller
public class IndexController {
    @Resource
    CustomersService customersService;
    @Resource
    CredentialtypeService credentialtypeService;
    @RequestMapping("/")
    public String toIndex(){
        return "index";
    }
    @RequestMapping("doIndex")
    @ResponseBody
    public Map<String,Object> doIndex(){
        Map<String,Object> map=new HashMap<>();
        List<Customers> customers = customersService.selectAll();
        map.put("data",customers);
        return map;
    }
    @RequestMapping("toAdd")
    public String toAdd(HttpSession session){
        session.setAttribute("cList",credentialtypeService.selectAll());
        return "index2";
    }
    @RequestMapping("add")
    public String add(Customers customers){
        customers.setAddtime(new Date());
        int add = customersService.add(customers);
        return "redirect:/";
    }
    @RequestMapping("doDel")
    @ResponseBody
    public Map<String,Object> doDel(Integer id){
        Map<String,Object> map=new HashMap<>();
        int delete = customersService.delete(id);
        map.put("data",delete);
        return map;
    }
}
