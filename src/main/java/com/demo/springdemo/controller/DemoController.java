package com.demo.springdemo.controller;

import com.demo.springdemo.service.collections.ArraySample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    ArraySample arraySample;

    @GetMapping("/demoGet")
    public String demoGet(){
        arraySample.arrayListDemo();
        return "This is a demo get 1";
    }
}
