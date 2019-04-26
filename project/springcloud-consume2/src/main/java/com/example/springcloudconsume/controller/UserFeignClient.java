package com.example.springcloudconsume.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.naming.Name;

/**
 * @描述:
 * @作者: Zhangxuewei
 * @包名: com.example.springcloudconsume.controller
 * @日期: 2018-06-2018/6/22 22:12
 * @修改: 无
 */
@FeignClient(name = "eureka-provide",fallbackFactory = OrderServiceFallbackFactory.class)
public interface UserFeignClient {
    @RequestMapping("/placeOrder")
    public String placeOrder();
}
