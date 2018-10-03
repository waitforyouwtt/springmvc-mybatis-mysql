package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: 一点点
 * @Date: 2018/10/3 20:13
 * @Version 1.0
 */
@Controller
@RequestMapping("/mvc")
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

}
