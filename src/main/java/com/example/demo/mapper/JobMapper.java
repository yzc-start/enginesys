package com.example.demo.mapper;

import com.example.demo.model.Engine;
import com.example.demo.model.Job;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface JobMapper {

    void addJob(Job Job);

    int deleteJob(Integer id);

    int updateJob(Job Job);

    ArrayList<Job> selectJob();

    Job selectJobBox(Integer id);
}
