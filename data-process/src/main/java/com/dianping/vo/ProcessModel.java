package com.dianping.vo;

/**
 * Created by snail on 10/16/16.
 */
public class ProcessModel {
    private String tableName;
    private String daoName;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getDaoName() {
        return daoName;
    }

    public void setDaoName(String daoName) {
        this.daoName = daoName;
    }

    @Override
    public String toString() {
        return "ProcessModel{" +
                "tableName='" + tableName + '\'' +
                ", daoName='" + daoName + '\'' +
                '}';
    }
}
