package com.spring.demo.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.spring.demo.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @HystrixCommand(fallbackMethod = "defaultHystrix")
    @Override
    public String hystrix() {
        return "hystrix" + (1 / 0);
    }

    private String defaultHystrix(Throwable throwable) {
        System.out.println(throwable.getMessage());
        return "default";
    }

}
