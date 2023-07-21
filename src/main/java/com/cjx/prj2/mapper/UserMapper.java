package com.cjx.prj2.mapper;

import com.cjx.prj2.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user")
    List<User> findAll();

    @Insert("INSERT into user(username,password,email,phone,address) VALUES (#{username}," +
            "#{password},#{email},#{phone},#{address})")
    int addUser(User user);

    int change(User user );

    @Delete("delete from user where user_id = #{id}")
    Integer delete(@Param("id") Integer id);

    List<User> selectUsersByPage(int pageNum, int pageSize);
}
