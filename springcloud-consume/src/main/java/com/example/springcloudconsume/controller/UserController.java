package com.example.springcloudconsume.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @描述:
 * @作者: Zhangxuewei
 * @包名: com.example.springcloudconsume.controller
 * @日期: 2018-06-2018/6/8 15:37
 * @修改: 无
 */
@RestController
public class UserController {

    @Resource
    RestTemplate restTemplate;

    @RequestMapping("/buy")
    public String buy(){
        String s = restTemplate.getForObject("http://EUREKA-PROVIDE/placeOrder",String.class);
        System.out.println(s);
        return s;
    }
}
