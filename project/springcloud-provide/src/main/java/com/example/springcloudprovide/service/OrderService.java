package com.example.springcloudprovide.service;

import org.springframework.stereotype.Service;

/**
 * @描述: 服务提供者
 * @作者: Zhangxuewei
 */
@Service
public class OrderService {
    public String placeOrder(){
        return "8001您购买了一本java开发书籍.";
    }
}
