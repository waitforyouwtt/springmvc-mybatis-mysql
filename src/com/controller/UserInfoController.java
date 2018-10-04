package com.controller;

import com.entity.UserInfo;
import com.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 一点点
 * @Date: 2018/10/3 21:27
 * @Version 1.0
 */
@Controller
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;

    @PostMapping("/user/register")
    public String register(String userName, String password) {
        if (!"".equals(userName) && !"".equals(password)) {
            Boolean result = userInfoService.register(userName, password);
            if (result) {
                // /为了防止刷新页面时表单重复提交
                return "redirect:/success";
            }
        } return "redirect:/";
    }

    @PostMapping("/user/login")
    public String login(String userName, String password, Model model) {
        if (!"".equals(userName) && !"".equals(password)) {
            UserInfo user = userInfoService.login(userName, password);
            if (null != user) {
                model.addAttribute("userName", user.getUserName());
                return "success";
            }
        }
        return "redirect:/";
    }

    @RequestMapping("/")
    public String showIndex() {
        return "index";
    }
    @RequestMapping("/success")
    public String showSuccess() {
        return "success";
    }
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
