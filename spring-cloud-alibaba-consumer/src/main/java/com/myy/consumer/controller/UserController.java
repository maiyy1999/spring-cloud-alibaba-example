package com.myy.consumer.controller;

import com.myy.consumer.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author myy
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;


    @RequestMapping("/order/{uid}")
    public String usersOrder(@PathVariable int uid){
        userService.getOrder(uid);
        return "hello";
    }

}
