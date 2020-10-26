package com.example.demo.model;

import java.util.Date;

public class Attendance {
    //id
    private Integer id;
    //工程名称
    private Integer gcmc;
    //姓名
    private Integer xm;
    //日期
    private Date rq;
    //备注
    private String bz;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGcmc() {
        return gcmc;
    }

    public void setGcmc(Integer gcmc) {
        this.gcmc = gcmc;
    }

    public Integer getXm() {
        return xm;
    }

    public void setXm(Integer xm) {
        this.xm = xm;
    }

    public Date getRq() {
        return rq;
    }

    public void setRq(Date rq) {
        this.rq = rq;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "id=" + id +
                ", gcmc=" + gcmc +
                ", xm=" + xm +
                ", rq=" + rq +
                ", bz='" + bz + '\'' +
                '}';
    }
}
