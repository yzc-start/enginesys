package com.example.demo.model;

public class Job {
    private Integer id;
    private String gw;
    private Integer isdelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGw() {
        return gw;
    }

    public void setGw(String gw) {
        this.gw = gw;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", gw='" + gw + '\'' +
                ", isdelete=" + isdelete +
                '}';
    }
}
