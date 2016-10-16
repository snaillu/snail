package com.dianping.enums;

/**
 * Created by snail on 10/16/16.
 */
public enum  ContentTypeEnum {
    URL(1,"url链接类型数据"),
    KEY(2,"key类型数据"),
    PLAINTTEXT(3,"超文本类型数据"),
    DEFAULT(4,"其他数据类型");

    private int code;
    private String msg;

    ContentTypeEnum(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
