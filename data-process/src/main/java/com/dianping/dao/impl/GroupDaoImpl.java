package com.dianping.dao.impl;

import com.dianping.dao.BaseDao;
import com.dianping.entity.Group;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by snail on 10/16/16.
 */
@Repository("groupDao")
public class GroupDaoImpl extends SqlSessionDaoSupport implements BaseDao<Group> {
    @Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public List<Group> queryGroupInfo() {
        List<Group> result = getSqlSession().selectList("groupDao.queryGroupInfo");
        return result;
    }

    public List<Group> getProcessData() {
        List<Group> result = getSqlSession().selectList("groupDao.queryGroupInfo");
        return result;
    }

    public boolean updateProcessedData(List<Group> dataList) {
        return false;
    }
}
