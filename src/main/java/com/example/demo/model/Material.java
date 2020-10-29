package com.example.demo.model;

public class Material {
    //id
    private Integer id;
    //工程名称
    private String gcmc;
    //材料名称
    private String clmc;
    //数量
    private Integer sl;
    //单价
    private Double dj;
    //合计
    private Double hj;
    //是否删除
    private Integer sfsc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGcmc() {
        return gcmc;
    }

    public void setGcmc(String gcmc) {
        this.gcmc = gcmc;
    }

    public String getClmc() {
        return clmc;
    }

    public void setClmc(String clmc) {
        this.clmc = clmc;
    }

    public Integer getSl() {
        return sl;
    }

    public void setSl(Integer sl) {
        this.sl = sl;
    }

    public Double getDj() {
        return dj;
    }

    public void setDj(Double dj) {
        this.dj = dj;
    }

    public Double getHj() {
        return hj;
    }

    public void setHj(Double hj) {
        this.hj = hj;
    }

    public Integer getSfsc() {
        return sfsc;
    }

    public void setSfsc(Integer sfsc) {
        this.sfsc = sfsc;
    }

    @Override
    public String toString() {
        return "Material{" +
                "id=" + id +
                ", gcmc='" + gcmc + '\'' +
                ", clmc='" + clmc + '\'' +
                ", sl=" + sl +
                ", dj=" + dj +
                ", hj=" + hj +
                ", sfsc=" + sfsc +
                '}';
    }
}
