package com.springcloudalibabafeign.userconsumer.controller;

import com.springcloudalibabafeign.userconsumer.domain.vo.UserVo;
import com.springcloudalibabafeign.userconsumer.service.IntegralService;
import com.springcloudalibabafeign.userconsumer.service.UserService;
import com.springcloudalibabafeign.userconsumer.service.UserServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
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
    UserService userService;

    @GetMapping("/list/{uid}")
    public UserVo getUserVoByUid( @PathVariable int uid){

        return userService.getUserVo(uid);
    }
}
