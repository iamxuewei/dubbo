package com.example.springcloudconsume.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @描述: 负载均衡模式修改，默认为轮询模式
 * @作者: Zhangxuewei
 * @日期: 2018-06-2018/6/22 10:04
 */
@Configuration
public class RibbonConfig {

    @Bean
    public IRule ribbonRule(){
        //改为随机模式
        return new RandomRule();
    }

}
