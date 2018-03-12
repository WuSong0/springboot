package com.winterchen.controller;

import com.winterchen.mapper.UserMapper;
import com.winterchen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/home"})
public class UserController {
    @Autowired
   private  UserMapper userMapper;
    @Autowired
    private UserService userService;

    //http://localhost:8080/home/user?phone=00000000000
    @RequestMapping(value = "/hello")
        public String user(){
        return "hello word! \n 如果你看到这个页面，恭喜你！ \n 第一个基础微服务框架搭建成功！";
    }

    @RequestMapping(value = "/user")
    public String user(@RequestParam(value="phone",required=true,defaultValue="00000000000") String phone ) {
        return userService.finduser(phone);
    }
}