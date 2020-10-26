package com.example.demo.controller;

import com.example.demo.model.ErrorMessage;
import com.example.demo.model.Hrmresource;
import com.example.demo.service.IHrmService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("hrm")
public class HrmController {


    @Resource
    IHrmService iHrmService;

    //添加员工
    @RequestMapping("/addHrm")
    public ErrorMessage addHrm(Hrmresource hrmresource){
        ErrorMessage errorMessage = new ErrorMessage();
        try {
            iHrmService.addHrm(hrmresource);
            errorMessage.setCode(100);
            errorMessage.setErrorMsg("请求成功");
            errorMessage.setSuccess(true);
        }catch (Exception e){
            errorMessage.setCode(200);
            errorMessage.setErrorMsg("添加失败，请联系管理员处理！");
            errorMessage.setSuccess(true);
        }
        return errorMessage;
    }

    //删除员工
    @RequestMapping("/deleteHrm")
    public ErrorMessage deleteHrm(@RequestParam(value = "id") Integer id){
        ErrorMessage errorMessage = new ErrorMessage();
        try {
            iHrmService.deleteHrm(id);
            errorMessage.setCode(100);
            errorMessage.setErrorMsg("请求成功");
            errorMessage.setSuccess(true);
        }catch (Exception e){
            errorMessage.setCode(200);
            errorMessage.setErrorMsg("删除失败，请联系管理员处理！");
            errorMessage.setSuccess(true);
        }
        return errorMessage;
    }

    //修改员工
    @RequestMapping("/updateHrm")
    public ErrorMessage updateHrm(Hrmresource hrmresource){
        ErrorMessage errorMessage = new ErrorMessage();
        try {
            iHrmService.updateHrm(hrmresource);
            errorMessage.setCode(100);
            errorMessage.setErrorMsg("请求成功");
            errorMessage.setSuccess(true);
        }catch (Exception e){
            errorMessage.setCode(200);
            errorMessage.setErrorMsg("编辑失败，请联系管理员处理！");
            errorMessage.setSuccess(true);
        }
        return errorMessage;
    }

    //查询员工
    @RequestMapping("/selectHrm")
    @ResponseBody
    public List<Hrmresource> selectHrm(){
        ErrorMessage errorMessage = new ErrorMessage();
        List<Hrmresource> hrmresources = iHrmService.selectHrm();
        return hrmresources;
    }
}
