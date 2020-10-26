package com.example.demo.controller;

import com.example.demo.model.Attendance;
import com.example.demo.model.ErrorMessage;
import com.example.demo.model.Hrmresource;
import com.example.demo.service.IAttenService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("att")
//考勤模块
public class AttenController {

    @Resource
    IAttenService iAttenService;

    //增加考勤
    @RequestMapping("/addAttendance")
    public ErrorMessage addAttendance(){
        return null;
    }

    //删除考勤
    @RequestMapping("/deleteAttendance")
    public ErrorMessage deleteAttendance(){
        return null;
    }

    //修改考勤
    @RequestMapping("/updateAttendance")
    public ErrorMessage updateAttendance(){
        return null;
    }

    //查询考勤
    @RequestMapping("/selectAttendance")
    public List<Attendance> selectAttendance(){
        return  iAttenService.selectAttendance();
    }
}
