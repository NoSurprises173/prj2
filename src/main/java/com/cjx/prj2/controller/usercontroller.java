package com.cjx.prj2.controller;

import com.cjx.prj2.entity.User;
import com.cjx.prj2.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static jdk.nashorn.internal.objects.Global.print;

@RestController
public class usercontroller {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/hello")
    public List<User> index(){
        return userMapper.findAll();
    }

    @PostMapping("/add")
    public Integer add(@RequestBody User user){
        return userMapper.addUser(user);
    }



}
