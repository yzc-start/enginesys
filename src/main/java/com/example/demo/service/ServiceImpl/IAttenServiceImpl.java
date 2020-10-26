package com.example.demo.service.ServiceImpl;

import com.example.demo.model.Attendance;
import com.example.demo.model.Hrmresource;
import com.example.demo.service.IAttenService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IAttenServiceImpl implements IAttenService {

    @Resource


    @Override
    public void addAttendance(Attendance attendance) {

    }

    @Override
    public void deleteAttendance(Integer id) {

    }

    @Override
    public void updateAttendance(Attendance attendance) {

    }

    @Override
    public List<Attendance> selectAttendance() {
        return null;
    }
}
