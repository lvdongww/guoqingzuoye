package com.kgc.controller;

import com.kgc.pojo.Person;
import com.kgc.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-01 23:18
 */
@Controller
public class PersonController {
    @Resource
    PersonService personService;
    @RequestMapping("/")
    public String toSelect(Model model){
        List<Person> people = personService.selectAll();
        model.addAttribute("pList",people);
        return "selectPerson";
    }
    @RequestMapping("add")
    public String add(){
        return "add";
    }
    @RequestMapping("addPerson")
    public String addPerson(Person person){
        int add = personService.add(person);
        return "redirect:/";
    }

}
