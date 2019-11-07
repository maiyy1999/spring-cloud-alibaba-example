package com.myy.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author myy
 */
@RestController
@Slf4j
public class UserController {

    @RequestMapping("/list/{uid}")
    public String list(@PathVariable int uid){
        log.info(uid+"");
        return "index";

    }
}
