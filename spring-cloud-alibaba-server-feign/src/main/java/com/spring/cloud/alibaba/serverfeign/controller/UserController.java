package com.spring.cloud.alibaba.serverfeign.controller;

import com.spring.cloud.alibaba.serverfeign.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author myy
 */
@RestController
@Slf4j
public class UserController {

    @Resource
    UserService userService;
    @RequestMapping("/orders/{uid}")
    public String getOrders(@PathVariable int uid){
        return userService.userOrders(uid);
    }

}
