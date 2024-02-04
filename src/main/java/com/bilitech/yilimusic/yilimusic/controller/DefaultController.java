package com.bilitech.yilimusic.yilimusic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class DefaultController {
    //使用81端口访问:http://localhost:81/hello
    @GetMapping
    public String hello(){
        return "hello music box";
    }
}
