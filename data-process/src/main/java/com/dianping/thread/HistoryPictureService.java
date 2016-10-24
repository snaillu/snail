package com.dianping.thread;

import com.dianping.entity.ArticlePic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by snail on 24/10/2016.
 */
public class HistoryPictureService {
    private static final Logger logger = LoggerFactory.getLogger(HistoryPictureService.class);
    ExecutorService executor = Executors.newFixedThreadPool(10);

    public static void main(String[] args){
        HistoryPictureService service = new HistoryPictureService();
        service.process();
    }

    public void process(){
        List<ArticlePic> dataList = getArticlePic(2000);
        CountDownLatch latch = new CountDownLatch(dataList.size());

        try{
            List<Future<ArticlePic>> result = new ArrayList<Future<ArticlePic>>();
            for(ArticlePic pic:dataList){
                Future<ArticlePic> processResult = executor.submit(new PictureProcessTask(pic,latch));
                result.add(processResult);
            }

            latch.await();

            for(Future<ArticlePic> future:result){
                logger.info("pic="+future.get());
            }

            executor.shutdown();
        }catch (Exception e){
            logger.error("process picture error, msg="+e.getMessage());
        }

    }

    private List<ArticlePic> getArticlePic(int size){
        List<ArticlePic> result = new ArrayList<ArticlePic>();
        ArticlePic pic = null;

        for(int i=0;i<size;i++){
            pic = new ArticlePic();
            pic.setId(i);
            pic.setPicUrl("picUrl"+i);
            result.add(pic);
        }

        return result;
    }
}
