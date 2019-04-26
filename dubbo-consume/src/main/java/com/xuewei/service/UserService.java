package com.xuewei.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xuewei.vo.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @描述:
 * @作者: Zhangxuewei
 * @包名: com.xuewei.service
 * @日期: 2018-06-2018/6/12 16:14
 * @修改: 无
 */
@Service
public class UserService {
    @Reference
    OrderService orderService;

    public User buy(){
        return  orderService.placeOrder();
    }

}
