package com.springcloudalibaba.integral.controller;

import com.springcloudalibaba.integral.entity.Integral;
import com.springcloudalibaba.integral.service.IntegralService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author myy
 */
@RestController
public class IntegralController {

    @Resource
    IntegralService integralService;
    @RequestMapping("/number/{uid}")
    public Integral getMemberCounts(@PathVariable int uid){
        return integralService.selectIntegralCounts(uid);
    }
}
