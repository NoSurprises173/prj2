package com.cjx.prj2.controller;

import com.cjx.prj2.entity.User;
import com.cjx.prj2.mapper.UserMapper;
import com.cjx.prj2.service.UserSevrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class usercontroller {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserSevrice userSevrice;

    @GetMapping("/hello")
    public List<User> index(){
        return userMapper.findAll();
    }

    @PostMapping("/add")
    public Integer add(@RequestBody User user){
        return userSevrice.save(user);
    }

    @DeleteMapping("/{id}")
    public Integer del(@PathVariable Integer id){
        return userMapper.delete(id);
    }

    /*
    @DeleteMapping("/delete")
    public Integer del(Integer id){
        return userMapper.delete(id);
    }
     */

}
