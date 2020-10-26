package com.example.demo.service;

import com.example.demo.model.Hrmresource;

import java.util.List;

public interface IHrmService {
    //增加员工
    void addHrm(Hrmresource hrmresource);
    //删除员工
    void deleteHrm(Integer id);
    //修改员工
    void updateHrm(Hrmresource hrmresource);
    //查询员工
    List<Hrmresource> selectHrm();
}
