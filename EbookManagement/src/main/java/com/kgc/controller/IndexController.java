package com.kgc.controller;

import com.github.pagehelper.PageInfo;
import com.kgc.pojo.EbookCategory;
import com.kgc.pojo.EbookEntry;
import com.kgc.service.EbookCategoryService;
import com.kgc.service.EbookEntryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shkstart
 * @create 2020-09-19 10:05
 */
@Controller
public class IndexController {
    @Resource
    EbookCategoryService ebookCategoryService;
    @Resource
    EbookEntryService ebookEntryService;
    @RequestMapping("/")
    public String toIndex(Model model){
        return "index";
    }
    @RequestMapping("toAdd")
    public String toAdd(Integer bookid,Model model){
        model.addAttribute("bookid",bookid);
        return "add";
    }
    @RequestMapping("selectCat")
    @ResponseBody
    public Map<String,Object> selectCat(){
        Map<String,Object> map=new HashMap<>();
        List<EbookCategory> ebookCategories = ebookCategoryService.selectAll();
        map.put("data",ebookCategories);
        return map;
    }
    @RequestMapping("selectPage")
    @ResponseBody
    public Map<String,Object> selectPage(Integer bookid,Integer pageIndex,Integer pageSize){
        Map<String,Object> map=new HashMap<>();
        PageInfo<EbookEntry> pageInfo = ebookEntryService.selectPage(bookid, pageIndex, pageSize);
        map.put("data",pageInfo);
        return map;
    }
    @RequestMapping("delete")
    @ResponseBody
    public Map<String,Object> delete(Integer id){
        Map<String,Object> map=new HashMap<>();
        int delete = ebookEntryService.delete(id);
        if (delete>0){
            map.put("sccueec","true");
        }else {
            map.put("sccueec","false");
        }
        return map;
    }
    @RequestMapping("/addbook")
    public String addbook(EbookEntry ebookEntry ){
        Map<String,Object> map=new HashMap<>();
        System.out.println(ebookEntry.toString());
        int add = ebookEntryService.add(ebookEntry);
        if (add>0){
            map.put("sccueec","true");
        }else {
            map.put("sccueec","false");
        }
        return "redirect:/";
    }
    @RequestMapping("/updatebook")
    public String updatebook(EbookEntry ebookEntry ){
        int add = ebookEntryService.update(ebookEntry);
        return "redirect:/";
    }
    @RequestMapping("/chuan")
    @ResponseBody
    public Map<String,Object> chuan(EbookEntry ebookEntry,HttpServletRequest request ){
        Map<String,Object> map =new HashMap<>();
        request.getSession().setAttribute("ebookEntry",ebookEntry);
        System.out.println(ebookEntry.toString());
        return map;
    }
    @RequestMapping("/toupdate")
    public String toupdate(){
        return "update";
    }
}
