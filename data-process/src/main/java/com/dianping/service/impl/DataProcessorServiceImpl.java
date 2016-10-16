package com.dianping.service.impl;

import com.dianping.dao.BaseDao;
import com.dianping.service.DataProcessorService;
import com.dianping.vo.ProcessModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by snail on 10/16/16.
 */
@Service
public class DataProcessorServiceImpl extends ApplicationObjectSupport implements DataProcessorService {
    private static final Logger logger = LoggerFactory.getLogger(DataProcessorServiceImpl.class);

    public <T> void process() {
        logger.info("[数据处理]  开始执行数据处理...");
        List<ProcessModel> models = getAllProcessModel();
        for(ProcessModel model:models){
            List<T> result = getProcessData(model);
            for(T item:result){
                Map<String,String> dataMap = convertProcessData(item);
                logger.info("[数据处理] T={}",dataMap);
            }
        }
    }


    //将实体信息转换为map便于就行数据处理
    private <T> Map<String,String> convertProcessData(T t){
        Map<String,String> result = new HashMap<String, String>();
        Class cls = t.getClass();
        Field[] fields = cls.getDeclaredFields();
        for(Field field:fields){
            String type = field.getType().toString();
            logger.debug("type={}",type);
            if(type.endsWith("String")){
                try{
                    field.setAccessible(true);
                    result.put(field.getName(),(String) field.get(t));
                }catch (Exception e){
                    logger.error("[数据处理]  将实体转为map失败,失败原因为:{}",e.getMessage());
                }
            }
        }

        return result;
    }

    //获取需要处理的原始数据
    private  <T> List<T> getProcessData(ProcessModel model){
        if(model==null || model.getDaoName()==null)
            return null;

        BaseDao dao = getProcessDao(model.getDaoName());
        List<T> result = dao.getProcessData();
        return result;
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
        result.add(model);

        return result;
    }

    //根据名称获取相应的数据处理dao
    public BaseDao getProcessDao(String name){
        ApplicationContext context = getApplicationContext();
        return (BaseDao) context.getBean(name);
    }
}
