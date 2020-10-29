package com.example.demo.mapper;

import com.example.demo.model.Material;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface MaterialMapper {
    void addMaterial(Material material);

    int deleteMaterial(Integer id);

    int updateMaterial(Material material);

    ArrayList<Material> selectMaterial();

}
