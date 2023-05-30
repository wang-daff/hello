package com.example.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wpf
 * @date 2023-04-09 01:25
 * @description
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
