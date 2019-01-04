package com.neuedu.controller;

import com.neuedu.dao.UserInfoMapper;
import com.neuedu.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @Autowired
    UserInfoMapper userInfoMapper;
    @RequestMapping(value = "/user/{userID}")
    public UserInfo findUser(@PathVariable Integer userID)
    {
        return userInfoMapper.selectByPrimaryKey(userID);
    }
}
