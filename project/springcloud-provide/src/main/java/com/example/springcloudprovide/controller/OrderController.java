package com.example.springcloudprovide.controller;

import com.example.springcloudprovide.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @描述:
 * @作者: Zhangxuewei
 * @包名: com.example.springcloudprovide.controller
 * @日期: 2018-06-2018/6/8 15:21
 * @修改: 无
 */
@RestController
public class OrderController {

    @Resource
    OrderService orderService;

    @RequestMapping("/placeOrder")
    public String placeOrder(){
       return orderService.placeOrder();
    }
}
