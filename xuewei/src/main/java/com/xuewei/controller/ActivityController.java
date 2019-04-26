package com.xuewei.controller;

import com.xuewei.activity.UserApply;
import com.xuewei.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/apply")
public class ActivityController extends BaseController{

    @Resource
    public UserApply userApply;

    /**
     *新建审批
     */
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(Model model){
        User user = this.getThisUser();
        return "pages/apply/add";
    }

    /**
     *新建审批
     */
    @ResponseBody
    @RequestMapping(value = "/userApply",method = RequestMethod.GET)
    public String userApply(@RequestParam(value = "userId", defaultValue = "") String userId){
        String mess = userApply.userApply(userId);
        return mess;
    }
}
