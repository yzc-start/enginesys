package com.example.demo.mapper;

import com.example.demo.model.Hrmresource;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HrmMapper {
    //增加员工
    void addHrm(Hrmresource hrmresource);

    //删除员工
    void deleteHrm(Integer id);

    //修改员工
    void updateHrm(Hrmresource hrmresource);

    //查询员工
    List<Hrmresource> selectHrm();
}
