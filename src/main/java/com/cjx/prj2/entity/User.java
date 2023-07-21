package com.cjx.prj2.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int user_id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String address;
}
