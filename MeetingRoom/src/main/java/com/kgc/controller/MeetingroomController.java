package com.kgc.controller;

import com.kgc.pojo.Meetingroom;
import com.kgc.service.MeetingroomService;
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
 * @create 2020-10-03 18:25
 */
@Controller
public class MeetingroomController {
    @Resource
    MeetingroomService meetingroomService;
    @RequestMapping("/")
    public String toIndex(){
        return "index";
    }
    @RequestMapping("toadd")
    public String toadd(){
        return "index2";
    }
    @RequestMapping("select")
    @ResponseBody
    public Map<String,Object> selectAll(){
        Map<String,Object> map=new HashMap<>();
        List<Meetingroom> meetingrooms = meetingroomService.selectAll();
        map.put("data",meetingrooms);
        return map;
    }
    @RequestMapping("add")
    public String add(Meetingroom meetingroom){
        meetingroom.setMeetingOrder(new Date());
        meetingroomService.add(meetingroom);
        return "redirect:/";
    }

}
