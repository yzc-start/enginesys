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
public class AttendanceController {

    @Resource
    IAttenService iAttenService;

    //增加考勤
    public ErrorMessage addAttendance(){

        return null;
    }

    //删除考勤
    public ErrorMessage deleteAttendance(){

        return null;
    }

    //修改考勤
    public ErrorMessage updateAttendance(){

        return null;
    }

    //查询考勤
    public List<Attendance> selectAttendance(){
        List<Attendance> attendances = iAttenService.selectAttendance();
        return attendances;
    }

}
