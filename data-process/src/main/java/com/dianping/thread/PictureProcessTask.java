package com.dianping.thread;

import com.dianping.entity.ArticlePic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/**
 * Created by snail on 24/10/2016.
 */
public class PictureProcessTask implements Callable<ArticlePic> {
    private static final Logger logger = LoggerFactory.getLogger(PictureProcessTask.class);

    private ArticlePic articlePic;
    private CountDownLatch countDownLatch;

    public PictureProcessTask(ArticlePic articlePic, CountDownLatch countDownLatch){
        this.articlePic = articlePic;
        this.countDownLatch = countDownLatch;
    }

    public ArticlePic call() throws Exception {
        try{
            articlePic.setPicUrl("This url is process by "+Thread.currentThread().getName());
            Thread.sleep(100);
            logger.info("{} is ok.",articlePic);
        }catch (Exception e){
            logger.error("error, msg="+e.getMessage());
        }finally {
            countDownLatch.countDown();
        }
        return articlePic;
    }
}
