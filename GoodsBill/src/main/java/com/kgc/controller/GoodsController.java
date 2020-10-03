package com.kgc.controller;

import com.kgc.pojo.Goods;
import com.kgc.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-03 17:28
 */
@Controller
public class GoodsController {
    @Resource
    GoodsService goodsService;
    @RequestMapping("/")
    public String toIndex(){
        return "index";
    }
    @RequestMapping("chuan")
    public String toSelect(Integer id, Model model, HttpSession session){
        List<Goods> goods = goodsService.selectAll(id);
        session.setAttribute("id",id);
        model.addAttribute("glist",goods);
        return "select";
    }
    @RequestMapping("chuanid")
    public String chuanid(Integer id, Model model){
        Goods goods = goodsService.selectAllById(id);
        model.addAttribute("good",goods);
        return "update";
    }
    @RequestMapping("update")
    public String update(Goods g){
        goodsService.update(g);
        return "redirect:/";
    }
}
