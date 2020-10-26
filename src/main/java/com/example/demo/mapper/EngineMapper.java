package com.example.demo.mapper;

import com.example.demo.model.Engine;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface EngineMapper {

    //添加工程
    void addEngine(Engine engine);

    //删除工程
    int deleteEngine(Integer id);

    //编辑工程
    int updateEngine(Engine engine);

    //查询工程
    ArrayList<Engine> selectEngine();
}
