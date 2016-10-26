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
        //dataProcessorService.process();
        int total = new Double(Math.ceil(126/100)).intValue();
        System.out.println("total="+total+"  Math.ceil(126/100)="+Math.ceil(126*1.0/100));

    }
}
