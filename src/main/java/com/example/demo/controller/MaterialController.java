package com.example.demo.controller;

import com.example.demo.model.ErrorMessage;
import com.example.demo.model.Hrmresource;
import com.example.demo.model.Material;
import com.example.demo.service.IMaterialService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("material")
public class MaterialController {

    @Resource
    IMaterialService iMaterialService;

    //添加材料
    @RequestMapping("/addMaterial")
    public ErrorMessage addHrm(Material material){
        ErrorMessage errorMessage = new ErrorMessage();
        System.out.println(material);
        try {
            iMaterialService.addMaterial(material);
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

    //删除材料
    @RequestMapping("/deleteMaterial")
    public ErrorMessage deleteHrm(@RequestParam(value = "id") Integer id){
        ErrorMessage errorMessage = new ErrorMessage();
        try {
            iMaterialService.deleteMaterial(id);
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

    //修改材料
    @RequestMapping("/updateMaterial")
    public ErrorMessage updateHrm(Material material){
        ErrorMessage errorMessage = new ErrorMessage();
        System.out.println(material);
        try {
            iMaterialService.updateMaterial(material);
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

    //查询材料
    @RequestMapping("/selectMaterial")
    @ResponseBody
    public List<Material> selectHrm(){
        System.out.println(111);
        ErrorMessage errorMessage = new ErrorMessage();
        return iMaterialService.selectMaterial();
    }
}
