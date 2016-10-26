package com.dianping.dao.impl;

import com.dianping.dao.BaseDao;
import com.dianping.entity.ArticlePic;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by snail on 10/16/16.
 */
@Repository("aritclePicDao")
public class ArticlePicDaoImpl extends SqlSessionDaoSupport implements BaseDao<ArticlePic> {
    @Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public List<ArticlePic> getProcessData() {
        return getSqlSession().selectList("articlePicDao.queryArticlePic");
    }

    public boolean updateProcessedData(List<ArticlePic> dataList) {
        return false;
    }
}
