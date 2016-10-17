package com.snail.study.controller;

import com.snail.study.entity.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author snail
 * @create 2016/08/12
 */
@RestController
public class GreetingController {
    private final AtomicLong id = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name",defaultValue = "World") String name){
        return new Greeting(id.incrementAndGet(),String.format("Hello,%s.",name));
    }
}
