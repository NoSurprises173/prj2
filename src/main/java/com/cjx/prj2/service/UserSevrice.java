package com.cjx.prj2.service;

import com.cjx.prj2.entity.User;
import com.cjx.prj2.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSevrice {

    @Autowired
    private UserMapper userMapper;
    public int  save(User user){
        if ( user.getUser_id() == null ){
                return userMapper.addUser(user);
        } else {
            return userMapper.change(user);
        }
    }


}
