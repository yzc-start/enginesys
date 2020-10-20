package com.example.demo.controller;

import com.example.demo.model.Engine;
import com.example.demo.model.ErrorMessage;
import com.example.demo.service.IEngineService;
import com.example.demo.service.ServiceImpl.IEgineServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("engine")
public class EngineController {

    @Autowired
    IEngineService iEngineService;

    //添加工程
    @RequestMapping("/addEngine")
    public void addEngine(@RequestParam(value = "gcmc") String gcmc,@RequestParam(value = "dz") String dz){
        Engine engine = new Engine();
        engine.setGcmc(gcmc);
        engine.setDz(dz);
        engine.setDelete(0);
        try {
            iEngineService.addEngine(engine);
        }catch (Exception e){
            ErrorMessage errorMessage = new ErrorMessage();
            errorMessage.setCode(200);
            errorMessage.setMsg("添加失败！");
        }

        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setCode(100);
        errorMessage.setMsg("添加成功！");

    }

    //删除工程
    @RequestMapping("/deleteEngine")
    public String deleteEngine(){
        int id = 1;
        iEngineService.deleteEngine(id);
        return "engine";
    }

    //修改工程
    @RequestMapping("/updateEngine")
    public String updateEngine(){
        Engine engine = new Engine();
        engine.setId(2);
        engine.setGcmc("工程修改");
        engine.setDz("新花园");
        iEngineService.updateEngine(engine);
        return "engine";
    }

    //查询工程
    @ResponseBody
    @RequestMapping("/selectEngine")
    public List<Engine> selectEngine(){
        ArrayList<Engine> engines = iEngineService.selectEngine();
        return engines;
    }


}
