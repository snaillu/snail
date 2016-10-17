package com.dianping.test;

import com.dianping.base.BaseTest;
import com.dianping.dao.ArticlePicDao;
import com.dianping.dao.BaseDao;
import com.dianping.entity.ArticlePic;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by snail on 10/16/16.
 */
public class ArticlePicDaoTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger(ArticlePicDaoTest.class);

    @Resource(name = "aritclePicDao")
    private BaseDao baseDao;

    @Test
    public void queryArticlePic(){
        logger.info("begin queryArticlePic");
        List<ArticlePic> list = baseDao.getProcessData();

        for(ArticlePic pic:list){
            logger.info("{}",pic);
        }
    }
}
