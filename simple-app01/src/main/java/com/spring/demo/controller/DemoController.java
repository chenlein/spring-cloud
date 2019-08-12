package com.spring.demo.controller;

import com.spring.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private DemoService service;

    @Autowired
    private Environment environment;

    @RequestMapping(value = "/config", method = RequestMethod.GET)
    public ResponseEntity<String> config() {
        return new ResponseEntity<>(this.environment.getProperty("foo"), HttpStatus.OK);
    }

    @RequestMapping(value = "/hystrix", method = RequestMethod.GET)
    public ResponseEntity<String> hystrix() {
        return new ResponseEntity<>(this.service.hystrix(), HttpStatus.OK);
    }


}
