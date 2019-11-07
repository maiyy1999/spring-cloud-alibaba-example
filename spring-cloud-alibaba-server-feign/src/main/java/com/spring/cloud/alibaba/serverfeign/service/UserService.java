package com.spring.cloud.alibaba.serverfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author myy
 */
@FeignClient("server-provider")
public interface UserService {
    @RequestMapping("/list/{uid}")
    String userOrders(@PathVariable int uid);


}
