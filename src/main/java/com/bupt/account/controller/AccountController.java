package com.bupt.account.controller;

import com.bupt.account.model.User;
import com.bupt.account.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by IntelliJ IDEA.
 * Description:  ---——require需求|ask问题|jira
 * Design :  ----the  design about train of thought 设计思路
 * User: yezuoyao
 * Date: 2019-03-11
 * Time: 13:15
 * Email:yezuoyao@huli.com
 *
 * @author yezuoyao
 * @since 1.0-SNAPSHOT
 */
@Controller
public class AccountController {
    @Autowired
    UserService userService;

    /**
     * 测试
     * @return
     */
    @RequestMapping("/")
    @ResponseBody()
    public String mainUrl(){
        return "account";
    }

    /**
     * 用户主页
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("hello")
    public String hello(@RequestParam("id") Long id,
                        Model model){
        User user = userService.findById(id);
        model.addAttribute("user", user);
        return "hello";
    }

}
