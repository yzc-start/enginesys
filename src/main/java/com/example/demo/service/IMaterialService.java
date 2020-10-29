package com.example.demo.service;

import com.example.demo.model.Job;
import com.example.demo.model.Material;

import java.util.ArrayList;

public interface IMaterialService {
    //添加材料
    void addMaterial(Material material);

    //删除材料
    int deleteMaterial(Integer id);

    //修改材料
    int updateMaterial(Material material);

    //查询材料
    ArrayList<Material> selectMaterial();
}
