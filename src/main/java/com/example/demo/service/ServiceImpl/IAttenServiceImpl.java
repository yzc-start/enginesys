package com.example.demo.service.ServiceImpl;

import com.example.demo.mapper.AttenMapper;
import com.example.demo.model.Attendance;
import com.example.demo.model.Hrmresource;
import com.example.demo.service.IAttenService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class IAttenServiceImpl implements IAttenService {

    @Resource
    AttenMapper attenMapper;

    @Override
    public void addAttendance(Attendance attendance) {
        attenMapper.addAttendance(attendance);
    }

    @Override
    public void deleteAttendance(Integer id) {
        attenMapper.deleteAttendance(id);
    }

    @Override
    public void updateAttendance(Attendance attendance) {
        attenMapper.updateAttendance(attendance);
    }

    @Override
    public List<Attendance> selectAttendance() {
        ArrayList<Attendance> attendances = attenMapper.selectAttendance();
        return attendances;
    }
}
