package com.dianping.service.impl;

import com.dianping.dao.BaseDao;
import com.dianping.dao.GroupDao;
import com.dianping.entity.Group;
import com.dianping.service.DataProcessorService;
import com.dianping.vo.ProcessModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.stereotype.Service;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by snail on 10/16/16.
 */
@Service
public class DataProcessorServiceImpl extends ApplicationObjectSupport implements DataProcessorService {
    private static final Logger logger = LoggerFactory.getLogger(DataProcessorServiceImpl.class);

    public void process() {
        ApplicationContext context = getApplicationContext();
        GroupDao dao = (GroupDao) context.getBean("groupDao");
        List<Group> list = dao.queryGroupInfo();
        for(Group group:list){
            logger.info("{}",group);
        }
    }

    //获取任务列表
    public List<ProcessModel> getAllProcessModel(){
        List<ProcessModel> result = new ArrayList<ProcessModel>();
        ProcessModel model = new ProcessModel();

        model.setDaoName("groupDao");
        model.setTableName("DP_Group");
        result.add(model);

        model = new ProcessModel();
        model.setDaoName("aritclePicDao");
        model.setTableName("DP_ArticlePic");

        return result;
    }

    //根据名称获取相应的数据处理dao
    public BaseDao getProcessDao(String name){
        ApplicationContext context = getApplicationContext();
        return (BaseDao) context.getBean(name);
    }
}
