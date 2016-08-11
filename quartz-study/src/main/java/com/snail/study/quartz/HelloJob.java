package com.snail.study.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by snail on 8/7/16.
 */
public class HelloJob implements Job {
    private static final Logger logger = LoggerFactory.getLogger(HelloJob.class);

    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("HelloJob execute...");
    }
}
