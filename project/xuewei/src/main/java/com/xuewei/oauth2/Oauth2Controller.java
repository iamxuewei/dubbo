package com.xuewei.oauth2;

import org.activiti.engine.impl.identity.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Oauth2Controller {

    @GetMapping("/user")
    public Authentication getUser(Authentication authentication) {
        System.out.println("resource: user {}"+ authentication);
        return authentication;
    }
}
