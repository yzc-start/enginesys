package com.example.demo.service;

import com.example.demo.model.Job;

import java.util.ArrayList;

public interface IJobService {
    //添加岗位
    void addJob(Job job);

    //删除岗位
    int deleteJob(Integer id);

    //修改岗位
    int updateJob(Job job);

    //查询岗位
    ArrayList<Job> selectJob();

    //查询回显
    Job selectJobBox(Integer id);
}
