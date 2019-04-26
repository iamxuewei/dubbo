package com.xuewei.mapper;

import com.xuewei.vo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface UserMapper {
    public User getUserByUserId(String userName);
    public List<User> getAllUser();
    public List<User> getAllUserBypage(HashMap<Object,Object> map);
}
