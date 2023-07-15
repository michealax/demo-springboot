package com.shane.rocketmq.controller;

import com.shane.rocketmq.entity.UserEntity;
import com.shane.rocketmq.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/users")
    public List<UserEntity> selectList(){
        return userMapper.selectList(null);
    }
}
