package com.example.springcloudconsume.controller;


import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component // 不要忘记添加，不要忘记添加
public class OrderServiceFallbackFactory implements FallbackFactory<UserFeignClient> {

    @Override
    public UserFeignClient create(Throwable throwable) {
        return new UserFeignClient() {
            @Override
            public String placeOrder() {
                return "服务降级熔断。";
            }
        };
    }
}


