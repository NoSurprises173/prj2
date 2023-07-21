package com.cjx.prj2.mapper;

import com.cjx.prj2.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user")
    List<User> findAll();

    @Insert("INSERT into user(username,password,email,phone,address) VALUES (#{username}," +
            "#{password},#{email},#{phone},#{address})")
    int addUser(User user);

    @Update("UPDATE user SET username = #{username} where user_id = #{id}")
    int changeName(String username,int id );
}
