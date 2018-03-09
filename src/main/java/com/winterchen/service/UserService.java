package com.winterchen.service;

import com.winterchen.domain.User;
import com.winterchen.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public String finduser(String phone){
        User user = userMapper.findUserByPhone(phone);
        return user.getName()+"-----"+user.getPassword();
    }
}

