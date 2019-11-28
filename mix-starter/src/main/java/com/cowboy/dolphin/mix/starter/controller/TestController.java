package com.cowboy.dolphin.mix.starter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Cowboy
 * @Description: About this class
 * @Date :Created in 18:14 2019/11/28 0028
 * @Version : 1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
