package com.service;

import com.entity.UserInfo;

/**
 * @Author: 一点点
 * @Date: 2018/10/3 21:34
 * @Version 1.0
 */
public interface UserInfoService {

    /**
     * 用户注册	 * @param username	 * @param password	 * @return
     */
    Boolean register(String username, String password);

    /**
     * 用户登陆	 * @param username	 * @param password	 * @return
     */
    UserInfo login(String username, String password);


}
