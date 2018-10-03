package com.mapper;

import com.entity.UserInfo;

import java.util.Map;

/**
 * @Author: 一点点
 * @Date: 2018/10/3 21:23
 * @Version 1.0
 */
public interface UserInfoMapper {

    /**
     * 用户注册	 * @param map	 * @return
     */
    Integer register(Map<String, Object> map);

    /**
     * 用户登陆	 * @param map	 * @return
     */
    UserInfo login(Map<String, Object> map);


}
