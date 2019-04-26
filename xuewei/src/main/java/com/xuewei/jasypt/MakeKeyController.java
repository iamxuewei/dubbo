package com.xuewei.jasypt;

import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MakeKeyController {

    @Autowired
    StringEncryptor encryptor;

    @ResponseBody
    @RequestMapping("/getKey")
    public String test() {
        String username = encryptor.encrypt("root");
        String password = encryptor.encrypt("123456");
        return  "root: "+username+",123456:"+password;
    }
}
