package com.dianping.test;

import com.dianping.dao.GroupDao;
import com.dianping.entity.Group;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by snail on 10/16/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config.xml")
public class GroupDaoTest extends AbstractJUnit4SpringContextTests {
    private static final Logger logger = LoggerFactory.getLogger(GroupDaoTest.class);

    @Autowired
    private GroupDao groupDao;

    @Test
    public void queryGroupInfo(){
        logger.info("This is a test.");
        List<Group> list = groupDao.queryGroupInfo();
        for(Group group:list){
            logger.info(group.toString());
        }
    }
}
