package com.rainbow.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangk19 on 2018/3/27.
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello, Spring Boot";
    }

}
