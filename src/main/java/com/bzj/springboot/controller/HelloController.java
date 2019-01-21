package com.bzj.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:bai
 * @data:2019/1/21
 **/
@RestController
public class HelloController {
    @Value("${person.name}")
    private String hello;

    @RequestMapping("/sayHello")
    public String sayHello(){
        return "Hello"+hello;
    }
}
