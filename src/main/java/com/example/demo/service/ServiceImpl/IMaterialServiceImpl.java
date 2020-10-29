package com.example.demo.service.ServiceImpl;

import com.example.demo.mapper.MaterialMapper;
import com.example.demo.model.Material;
import com.example.demo.service.IMaterialService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class IMaterialServiceImpl implements IMaterialService {
    @Resource
    MaterialMapper materialMapper;

    @Override
    public void addMaterial(Material material) {
        materialMapper.addMaterial(material);
    }

    @Override
    public int deleteMaterial(Integer id) {
        materialMapper.deleteMaterial(id);
        return 0;
    }

    @Override
    public int updateMaterial(Material material) {
        materialMapper.updateMaterial(material);
        return 0;
    }

    @Override
    public ArrayList<Material> selectMaterial() {
        return materialMapper.selectMaterial();
    }
}
