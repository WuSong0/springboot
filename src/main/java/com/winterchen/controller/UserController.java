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


//    @ResponseBody
//    public String user(){
//        User user = userMapper.findUserByPhone("13545152730");
//        return user.getName()+"-----"+user.getPassword();
//    }

    //http://localhost:8080/home/user?phone=13545152730
    @RequestMapping(value = "/hello")
        public String user(){
        return "hello word!";
    }

    @RequestMapping(value = "/user")
    public String user(@RequestParam(value="phone",required=true,defaultValue="13545152730") String phone ) {
        return userService.finduser(phone);
    }
}