package com.serviceimpl;

import com.entity.UserInfo;
import com.mapper.UserInfoMapper;
import com.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 一点点
 * @Date: 2018/10/3 21:35
 * @Version 1.0
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public Boolean register(String username, String password) {
        Map<String, Object> map = new HashMap<>();
        map.put("userName", username);
        map.put("password", password);
        Integer result = userInfoMapper.register(map);
        if (result == 1) {
            return true;
        }else{
            return false;
        }
    }
    @Override
    public UserInfo login(String username, String password) {
        Map<String, Object> map = new HashMap<>();
        map.put("userName", username);
        map.put("password", password);
        UserInfo user = userInfoMapper.login(map);
        return user;
    }
}
