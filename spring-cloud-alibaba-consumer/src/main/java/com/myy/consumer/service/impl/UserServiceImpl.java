package com.myy.consumer.service.impl;

import com.myy.consumer.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    RestTemplate restTemplate;

    @Override
    public String getOrder(int uid) {
        return restTemplate.getForObject("http://server-provider/list/" + uid, String.class);
    }
}
