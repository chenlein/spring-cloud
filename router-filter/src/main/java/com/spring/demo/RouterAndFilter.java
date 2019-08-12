package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class RouterAndFilter {

    public static void main(String[] args) {
        SpringApplication.run(RouterAndFilter.class, args);
    }

}
