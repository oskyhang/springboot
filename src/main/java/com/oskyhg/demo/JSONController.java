package com.oskyhg.demo;

import com.oskyhg.springboot.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: 返回JSON格式的controller
 * author: Smile
 * date: 2017/4/8
 */
//@RestController注解注释的Controller的返回值都将以JSON格式数据返回
@RestController
public class JSONController {
    @RequestMapping("/getUser")
    public User getUser() {
        User user=new User();
        user.setUsername("小明");
        user.setPassword("xxxx");
        return user;
    }
}
