package com.xuewei.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.xuewei.service.OrderService;
import com.xuewei.vo.User;
import org.springframework.stereotype.Component;

/**
 * @描述: 服务提供者
 * @作者: Zhangxuewei
 */
@Service
@Component
public class OrderServiceImpl implements OrderService {
    @Override
    public User placeOrder(){
       User user = new User();
       user.setUserId("1000");
       user.setUserName("zhangxuewei");
       user.setAge("18");
       user.setPhone("13099998888");
       user.setEmail("10000@qq.com");
       return user;
    }
}
