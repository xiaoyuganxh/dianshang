package com.mzdx.controller;

import com.mzdx.pojo.UserInfo;
import com.mzdx.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;
    @RequestMapping("getAll")
    public List<UserInfo> findAllUser(){
        return userInfoService.findAllUser();
    }
    @RequestMapping("getUserByPrimaryKey")
    public UserInfo getUserByPrimaryKey(String uid){
        UserInfo userInfo=new UserInfo();
        userInfo.setId(uid);
       return this.userInfoService.findUserByPrimaryKey(userInfo);
    }
}
