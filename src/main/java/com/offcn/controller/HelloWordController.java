package com.offcn.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @Value("${host_ip}")
    private String hostIp;

    @Value("${host_name}")
    private String hostName;

    @Value("${userHost.name}")
    private String username;

    @RequestMapping("hellWorld")
    public String helloWord(){

        System.out.println(hostIp+"----------"+hostName+"======"+username);
        return "helloSpringBoot";
    }
}
