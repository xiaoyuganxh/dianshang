package com.mzdx.service;

import com.mzdx.pojo.UserInfo;

import java.util.List;

public interface UserInfoService {
    public List<UserInfo> findAllUser();
    public UserInfo findUserByPrimaryKey(UserInfo userInfo);
}
