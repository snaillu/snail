package com.dianping.test.service;

import com.dianping.base.BaseTest;
import com.dianping.service.DataProcessorService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by snail on 10/16/16.
 */
public class DataProcessorServiceTest extends BaseTest {
    @Autowired
    private DataProcessorService dataProcessorService;

    @Test
    public void process(){
        dataProcessorService.process();
    }
}
