package com.example.demo.controller;

import com.example.demo.model.Engine;
import com.example.demo.model.ErrorMessage;
import com.example.demo.service.IEngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("engine")
public class EngineController {

    @Resource
    IEngineService iEngineService;

    //添加工程
    @RequestMapping("/addEngine")
    @ResponseBody
    public ErrorMessage addEngine(@RequestParam(value = "gcmc") String gcmc,
                                  @RequestParam(value = "dz") String dz,
                                  @RequestParam(value = "gcys") Double gcys){
        Engine engine = new Engine();
        engine.setGcmc(gcmc);
        engine.setDz(dz);
        engine.setGcys(gcys);
        ErrorMessage errorMessage = new ErrorMessage();
        try {
            iEngineService.addEngine(engine);
            errorMessage.setCode(100);
            errorMessage.setErrorMsg("添加成功！");
            errorMessage.setSuccess(true);
        }catch (Exception e){
            errorMessage.setCode(200);
            errorMessage.setErrorMsg("添加失败，请联系管理员处理！");
            errorMessage.setSuccess(false);
        }
        return errorMessage;
    }

    //删除工程
    @RequestMapping("/deleteEngine")
    @ResponseBody
    public ErrorMessage deleteEngine(@RequestParam(value = "id") Integer id){
        ErrorMessage errorMessage = new ErrorMessage();
        try {
            iEngineService.deleteEngine(id);
            errorMessage.setSuccess(true);
            errorMessage.setCode(100);
            errorMessage.setErrorMsg("请求成功");
        }catch (Exception e){
            errorMessage.setSuccess(false);
            errorMessage.setCode(200);
            errorMessage.setErrorMsg("删除失败，请联系系统管理员处理！");
        }
        return errorMessage;
    }

    //修改工程
    @RequestMapping("/updateEngine")
    @ResponseBody
    public ErrorMessage updateEngine(@RequestParam(value = "id") Integer id,
                               @RequestParam(value = "gcmc") String gcmc,
                               @RequestParam(value = "dz") String dz){
        Engine engine = new Engine();
        ErrorMessage errorMessage = new ErrorMessage();
        try {
            engine.setId(id);
            engine.setGcmc(gcmc);
            engine.setDz(dz);
            iEngineService.updateEngine(engine);
            errorMessage.setCode(100);
            errorMessage.setErrorMsg("请求成功");
            errorMessage.setSuccess(true);
        }catch (Exception e){
            errorMessage.setCode(200);
            errorMessage.setErrorMsg("编辑失败，请联系管理员处理！");
            errorMessage.setSuccess(false);
        }
        return errorMessage;
    }

    //查询工程
    @RequestMapping("/selectEngine")
    @ResponseBody
    public List<Engine> selectEngine(){
        return iEngineService.selectEngine();
    }

    //查询工程
    @RequestMapping("/selectEngineBox")
    @ResponseBody
    public Engine selectEngineBox(Integer id){
        return iEngineService.selectEngineBox(id);
    }
}
