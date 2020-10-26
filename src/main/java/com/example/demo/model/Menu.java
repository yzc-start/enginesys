package com.example.demo.model;

import java.util.List;

public class Menu {
    private Integer id;
    private String text;
    private String iconCls;
    private String state;
    private Integer fid;
    private List<Menu> children;
    private String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", iconCls='" + iconCls + '\'' +
                ", state='" + state + '\'' +
                ", fid=" + fid +
                ", children=" + children +
                ", url='" + url + '\'' +
                '}';
    }
}
