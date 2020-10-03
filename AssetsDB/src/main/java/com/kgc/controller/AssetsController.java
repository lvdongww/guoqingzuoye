package com.kgc.controller;

import com.kgc.pojo.Assets;
import com.kgc.service.AssetsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shkstart
 * @create 2020-10-03 15:04
 */
@Controller
public class AssetsController {
    @Resource
    AssetsService assetsService;
    @RequestMapping("/")
    public String toIndex(){
        return "index";
    }
    @RequestMapping("select")
    @ResponseBody
    public Map<String,Object> select(String assetsid,String assetstype){
        Map<String,Object> map=new HashMap<>();
        List<Assets> assets = assetsService.selectAll(assetsid,assetstype);
        map.put("data",assets);
        return map;
    }
    @RequestMapping("toadd")
    public String toadd(){
        return "index2";
    }
    @RequestMapping("add")
    public String add(Assets assets){
        assets.setIntodate(new Date());
        assetsService.add(assets);
        return "redirect:/";
    }
}
