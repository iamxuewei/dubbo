package com.xuewei.controller;

import com.alibaba.fastjson.JSONObject;
import com.xuewei.service.UserService;
import com.xuewei.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    public UserService userService;
    @Resource
    RestTemplate restTemplate;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(Map<String,Object> map) {
        List<User> result = new ArrayList<User>();
        result = userService.getAllUser();
        map.put("result",result);
        return "pages/user";
    }

    @ResponseBody
    @RequestMapping(value = "/getJson",method = RequestMethod.GET)
    public JSONObject getJson(Map<String,Object> map, int limit, int offset,
                              @RequestParam(value = "userName", defaultValue = "") String userName,
                              @RequestParam(value = "sort", defaultValue = "") String sort,
                              @RequestParam(value = "order", defaultValue = "") String order) {
        List<User> result = new ArrayList<User>();
        List<User> result2 = new ArrayList<User>();
        result = userService.getAllUserBypage(limit, offset,userName);
        result2 =userService.getAllUser();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("rows",result);
        jsonObject.put("total",result2.size());
        return jsonObject;
    }

    @ResponseBody
    @RequestMapping(value = "/getJson2",method = RequestMethod.GET)
    public List<User> getJson2(Map<String,Object> map) {
        List<User> result2 = new ArrayList<User>();
        result2 =userService.getAllUser();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("rows",result2);
        jsonObject.put("total",result2.size());
        return result2;
    }

    @ResponseBody
    @RequestMapping(value = "/getJson3",method = RequestMethod.GET)
    public List<User> getJson3(Map<String,Object> map, @RequestParam(value = "userName", defaultValue = "") String userName) {
        List<User> result = new ArrayList<User>();
        result = userService.getAllUserBypage(8, 0,"");
        return result;
    }

    @ResponseBody
    @RequestMapping("/buy")
    public String buy(){
        String s = restTemplate.getForObject("http://EUREKA-PROVIDE/placeOrder",String.class);
        return s;
    }
}
