package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

    @RequestMapping("/")
    public String index() {
        System.out.print("用print输出的第一条信息");
        return "index";
    }

    @RequestMapping(
            value = {"/testRequestMapping", "/test"},
            method = {RequestMethod.POST}
    )
    public String test() {
        return "index";
    }


    @GetMapping("/testGetMapping")
    public String testGetMapping() {
        return "success";
    }
}
