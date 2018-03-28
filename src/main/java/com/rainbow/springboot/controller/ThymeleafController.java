package com.rainbow.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by yangk19 on 2018/3/28.
 */
@Controller
@RequestMapping("thymeleaf")
public class ThymeleafController {

    @RequestMapping("hellotl")
    public String hello(Map<String,Object> map) {

        map.put("msg", "Hello Thymeleaf");
        return "hello";
    }

}
