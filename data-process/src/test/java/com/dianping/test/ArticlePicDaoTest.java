package com.dianping.test;

import com.dianping.base.BaseTest;
import com.dianping.dao.ArticlePicDao;
import com.dianping.entity.ArticlePic;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by snail on 10/16/16.
 */
public class ArticlePicDaoTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger(ArticlePicDaoTest.class);

    @Autowired
    private ArticlePicDao articlePicDao;

    @Test
    public void queryArticlePic(){
        logger.info("begin queryArticlePic");
        List<ArticlePic> list = articlePicDao.queryArticlePic();

        for(ArticlePic pic:list){
            logger.info("{}",pic);
        }
    }
}
