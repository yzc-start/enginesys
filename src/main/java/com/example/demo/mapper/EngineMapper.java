package com.example.demo.mapper;

import com.example.demo.model.Engine;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface EngineMapper {

    void addEngine(Engine engine);

    int deleteEngine(Integer id);

    int updateEngine(Engine engine);

    ArrayList<Engine> selectEngine();
}
