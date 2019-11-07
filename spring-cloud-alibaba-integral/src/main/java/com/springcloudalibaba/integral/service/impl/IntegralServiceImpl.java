package com.springcloudalibaba.integral.service.impl;

import com.springcloudalibaba.integral.entity.Integral;
import com.springcloudalibaba.integral.mapper.IntegralMapper;
import com.springcloudalibaba.integral.service.IntegralService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/**
 * @author myy
 */
@Service
public class IntegralServiceImpl implements IntegralService {
    @Resource
    private IntegralMapper integralMapper;
    @Override
    public Integral selectIntegralCounts(Integer uid) {
        return integralMapper.selectCountByUserId(uid);
    }
}
