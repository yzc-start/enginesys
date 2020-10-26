package com.example.demo.controller;

import com.example.demo.model.ErrorMessage;
import com.example.demo.model.Job;
import com.example.demo.service.IJobService;
import org.springframework.boot.context.properties.bind.validation.ValidationErrors;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("job")
public class JobController {

    @Resource
    IJobService iJobService;

    //添加岗位
    @RequestMapping("/addJob")
    public ErrorMessage addEngine(@RequestParam(value = "gw") String gw){
        Job job = new Job();
        job.setGw(gw);
        ErrorMessage errorMessage = new ErrorMessage();
        try {
            iJobService.addJob(job);
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

    //删除岗位
    @RequestMapping("/deleteJob")
    public ErrorMessage deleteEngine(@RequestParam(value = "id") Integer id){
        ErrorMessage errorMessage = new ErrorMessage();
        try {
            iJobService.deleteJob(id);
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

    //修改岗位
    @RequestMapping("/updateJob")
    public ErrorMessage updateEngine(@RequestParam(value = "id") Integer id,
                               @RequestParam(value = "gw") String gw){
        Job job = new Job();
        ErrorMessage errorMessage = new ErrorMessage();
        try {
            job.setId(id);
            job.setGw(gw);
            iJobService.updateJob(job);
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

    //查询岗位
    @RequestMapping("/selectJob")
    public List<Job> selectEngine(){
        ArrayList<Job> jobs = iJobService.selectJob();
        return jobs;
    }


    //查询回显
    @RequestMapping("/selectJobBox")
    public Job selectJobBox(@RequestParam(value = "id") Integer id){
        Job job = iJobService.selectJobBox(id);
        return job;
    }

}
