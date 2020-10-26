package com.example.demo.service.ServiceImpl;

import com.example.demo.mapper.HrmMapper;
import com.example.demo.model.Hrmresource;
import com.example.demo.service.IHrmService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IHrmServiceImpl implements IHrmService {

    @Resource
    HrmMapper hrmMapper;

    @Override
    public void addHrm(Hrmresource hrmresource) {
        hrmMapper.addHrm(hrmresource);
    }

    @Override
    public void deleteHrm(Integer id) {
        hrmMapper.deleteHrm(id);
    }

    @Override
    public void updateHrm(Hrmresource hrmresource) {
        hrmMapper.updateHrm(hrmresource);
    }

    @Override
    public List<Hrmresource> selectHrm() {
        List<Hrmresource> hrmresources = hrmMapper.selectHrm();
        return hrmresources;
    }
}
