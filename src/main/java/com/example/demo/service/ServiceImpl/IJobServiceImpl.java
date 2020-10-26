package com.example.demo.service.ServiceImpl;

import com.example.demo.mapper.JobMapper;
import com.example.demo.model.Job;
import com.example.demo.service.IJobService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class IJobServiceImpl implements IJobService {

    @Resource
    JobMapper jobMapper;

    @Override
    public void addJob(Job job) {
        jobMapper.addJob(job);
    }

    @Override
    public int deleteJob(Integer id) {
        jobMapper.deleteJob(id);
        return 0;
    }

    @Override
    public int updateJob(Job job) {
        jobMapper.updateJob(job);
        return 0;
    }

    @Override
    public ArrayList<Job> selectJob() {
        ArrayList<Job> jobs = jobMapper.selectJob();
        return jobs;
    }

    @Override
    public Job selectJobBox(Integer id) {
        Job job = jobMapper.selectJobBox(id);
        return job;
    }
}
