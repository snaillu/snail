package com.dianping.entity;

import java.util.Date;

/**
 * Created by snail on 10/16/16.
 */
public class ArticlePic {
    private int id;
    private String picUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    @Override
    public String toString() {
        return "ArticlePic{" +
                "id=" + id +
                ", picUrl='" + picUrl + '\'' +
                '}';
    }
}
