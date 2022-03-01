package com.atguigu.mvc.controller;

import com.atguigu.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Array;

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
    @PostMapping("/testpojo")
    public String testpojo(
        User user
            ) {
        System.out.println(user+"=====");
        return "success";
    }
    //p41
}
