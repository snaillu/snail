package com.snail.test;

import com.snail.study.quartz.HelloJob;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by snail on 8/7/16.
 */
public class QuartzTest {
    private static final Logger logger = LoggerFactory.getLogger(QuartzTest.class);

    public static void main(String[] args){
        try{
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

            JobDetail jobDetail = JobBuilder.newJob(HelloJob.class)
                    .withIdentity("job1","group1").build();

            Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger1","group1")
                    .startNow().withSchedule(SimpleScheduleBuilder
                            .simpleSchedule().withIntervalInSeconds(5).repeatForever()).build();
            //scheduler.scheduleJob(jobDetail,trigger);


            scheduler.start();
            //scheduler.shutdown();
        }catch (Exception e){
            System.out.print(e.getMessage());
        }
    }
}
