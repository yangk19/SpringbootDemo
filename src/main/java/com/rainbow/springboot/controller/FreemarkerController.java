package com.rainbow.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by yangk19 on 2018/3/27.
 */
@Controller
@RequestMapping("freemarker")
public class FreemarkerController {

    @RequestMapping("hellofr")
    public String hello(Map<String,Object> map) {

        map.put("msg", "Hello Freemarker");
        return "hello";
    }

}
