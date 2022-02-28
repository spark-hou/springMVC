package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

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

    @GetMapping("/testServletAPI")
    public String testServletAPI(HttpServletRequest request) {
        String username = request.getParameter("userName");
        String password = request.getParameter("password");
        System.out.println(username + password);
        return "success";
    }

    @GetMapping("/testParam")
    public String testParam(
            String userName,
            String password,
            @RequestHeader("host") String host) {
        System.out.println(userName + password + " testParam" + host);
        return "success";
    }
//p32
    @GetMapping("/testpojo")
    public String testpojo(

            ) {
        System.out.println(user);
        return "success";
    }
}
