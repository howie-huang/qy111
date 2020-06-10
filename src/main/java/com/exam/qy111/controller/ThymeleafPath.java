package com.exam.qy111.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * thymeleaf路径跳转
 * @author 31515
 */
@Controller
public class ThymeleafPath {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
