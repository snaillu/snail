package com.dianping.dao;

import java.util.List;

/**
 * Created by snail on 10/16/16.
 */
public interface BaseDao<T> {
    //查询数据
    public List<T> getProcessData();

    //更新处理完毕的数据
    public boolean updateProcessedData(List<T> dataList);
}
