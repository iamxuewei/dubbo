package com.xuewei.rest;

import com.xuewei.service.UserService;
import com.xuewei.vo.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Rest {
    @Resource
    public UserService userService;


    @RequestMapping("/user/add/{name}")
    public User getUser(@PathVariable(name = "name")String name) {
        User user = userService.getUserByUserId(name);
        return user;
    }
    @RequestMapping("/user/del/{name}")
    public User delUser(@PathVariable(name = "name")String name) {
        User user = userService.getUserByUserId(name);
        return user;
    }

}
