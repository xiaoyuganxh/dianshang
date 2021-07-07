package com.mzdx.service;

import com.mzdx.mapper.UserInfoMapper;
import com.mzdx.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAllUser() {
        return userInfoMapper.selectAll();
    }

    @Override
    public UserInfo findUserByPrimaryKey(UserInfo userInfo) {
        return this.userInfoMapper.selectByPrimaryKey(userInfo);
    }
}
