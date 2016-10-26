package com.dianping.test;

import com.dianping.dao.BaseDao;
import com.dianping.entity.ArticlePic;
import com.dianping.entity.Group;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.annotation.SystemProfileValueSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by snail on 10/16/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config.xml")
public class GroupDaoTest extends AbstractJUnit4SpringContextTests {
    private static final Logger logger = LoggerFactory.getLogger(GroupDaoTest.class);

    @Resource(name = "groupDao")
    private BaseDao baseDao;

    @Test
    public void queryGroupInfo(){
        logger.info("This is a test.");
        List<Group> list = baseDao.getProcessData();
        for(Group group:list){
            logger.info(group.toString());
        }
    }

    @Test
    public void test(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        List<Integer> subList = list.subList(1,3);
        System.out.println("list="+list);
        System.out.println("subList="+subList);
        subList.remove(0);
        System.out.println("list="+list);
        System.out.println("subList="+subList);

    }

    @Test
    public void test1(){
        List<ArticlePic> list = new ArrayList<ArticlePic>();
        ArticlePic pic = new ArticlePic();
        pic.setId(1);
        pic.setPicUrl("picurl1");
        list.add(pic);

        pic = new ArticlePic();
        pic.setId(2);
        pic.setPicUrl("picurl2");
        list.add(pic);

        pic = new ArticlePic();
        pic.setId(3);
        pic.setPicUrl("picurl3");
        list.add(pic);

        List<ArticlePic> subList = list.subList(0,1);
        System.out.println("list="+list);
        System.out.println("subList="+subList);
        ArticlePic picUrl = subList.get(0);
        picUrl.setPicUrl("sdlkjfsd");

        System.out.println("");
        System.out.println("list="+list);
        System.out.println("subList="+subList);


    }
}
