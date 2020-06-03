package com.offcn.controller;


import com.offcn.pojo.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {

    @RequestMapping("findOne/{id}")
    public User findOne(@PathVariable("id") Integer id){
        //构建user对象
        return new User(id,"zs"+id,new Date());
    }

    @RequestMapping("saveUser1")
    public User saveUser1( User user){
        return user;
    }

}
