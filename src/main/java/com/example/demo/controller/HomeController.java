package com.example.demo.controller;

import com.example.demo.model.Engine;
import com.example.demo.model.Job;
import com.example.demo.model.Menu;
import com.example.demo.service.IEngineService;
import com.example.demo.service.IJobService;
import com.example.demo.service.IMenueService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("home")
public class HomeController {

    //目录
    @Resource
    IMenueService iMenueService;

    //工程
    @Resource
    IEngineService iEngineService;

    //岗位
    @Resource
    IJobService iJobService;


    @ResponseBody
    @RequestMapping("/menu")
    public List<Menu> menu(){
        List<Menu> menus = iMenueService.selectMenu();
        return menus;
    }

    @RequestMapping("/index")
    public ModelAndView index(){
        List<Menu> menus = iMenueService.selectMenu();
        ModelAndView mv = new ModelAndView();
        mv.addObject("menus",menus);
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping("/engine")
    public String engine(){
        return "engine";
    }

    //岗位
    @RequestMapping("/job")
    public String job(){
        return "job";
    }

    //员工信息
    @RequestMapping("/hrmresource")
    public String hrmresource(){
        return "hrmresource";
    }

    //材料
    @RequestMapping("/material")
    public String material(){
        return "material";
    }

    //考勤
    @RequestMapping("/attendance")
    public String attendance(){
        return "attendance";
    }

}
