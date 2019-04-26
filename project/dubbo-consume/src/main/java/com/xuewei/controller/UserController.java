package com.xuewei.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xuewei.service.UserService;
import com.xuewei.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @描述:dubbo消费
 * @作者: Zhangxuewei
 * @日期: 2018-06-2018/6/12 15:24
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/buy")
    public String buy(){
        User user = userService.buy();
        return user.toString();
    }

}
