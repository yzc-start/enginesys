package com.example.demo.service;

import com.example.demo.model.Attendance;
import com.example.demo.model.Hrmresource;

import java.util.List;

public interface IAttenService {
    //增加考勤
    void addAttendance(Attendance attendance);
    //删除考勤
    void deleteAttendance(Integer id);
    //修改考勤
    void updateAttendance(Attendance attendance);
    //查询考勤
    List<Attendance> selectAttendance();
}
