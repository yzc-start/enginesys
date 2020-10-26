package com.example.demo.model;

public class Hrmresource {

    private String id;
    //姓名
    private String xm;
    //岗位
    private Integer gw;
    //性别
    private Integer xb;
    //身份证
    private String sfzh;
    //银行账号
    private String yhzh;
    //年龄
    private Integer nl;
    //电话
    private String dh;
    //备注
    private String bz;
    //是否删除
    private Integer isdelete;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public Integer getGw() {
        return gw;
    }

    public void setGw(Integer gw) {
        this.gw = gw;
    }

    public Integer getXb() {
        return xb;
    }

    public void setXb(Integer xb) {
        this.xb = xb;
    }

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

    public String getYhzh() {
        return yhzh;
    }

    public void setYhzh(String yhzh) {
        this.yhzh = yhzh;
    }

    public Integer getNl() {
        return nl;
    }

    public void setNl(Integer nl) {
        this.nl = nl;
    }

    public String getDh() {
        return dh;
    }

    public void setDh(String dh) {
        this.dh = dh;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    @Override
    public String toString() {
        return "Hrmresource{" +
                "id='" + id + '\'' +
                ", xm='" + xm + '\'' +
                ", gw=" + gw +
                ", xb=" + xb +
                ", sfzh='" + sfzh + '\'' +
                ", yhzh='" + yhzh + '\'' +
                ", nl=" + nl +
                ", dh='" + dh + '\'' +
                ", bz='" + bz + '\'' +
                ", isdelete=" + isdelete +
                '}';
    }
}
