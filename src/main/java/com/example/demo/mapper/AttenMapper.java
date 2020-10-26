package com.example.demo.mapper;

import com.example.demo.model.Attendance;
import com.example.demo.model.Engine;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface AttenMapper {

    //添加考勤
    void addAttendance(Attendance attendance);

    //删除考勤
    int deleteAttendance(Integer id);

    //编辑考勤
    int updateAttendance(Attendance attendance);

    //查询考勤
    ArrayList<Engine> selectAttendance();
}
