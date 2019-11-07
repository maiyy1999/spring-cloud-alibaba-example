package com.springcloudalibaba.integral.mapper;

import com.springcloudalibaba.integral.entity.Integral;

public interface IntegralMapper {
    int deleteByPrimaryKey(Integer integralId);

    int insert(Integral record);

    int insertSelective(Integral record);

    Integral selectByPrimaryKey(Integer integralId);

    int updateByPrimaryKeySelective(Integral record);

    int updateByPrimaryKey(Integral record);

    Integral selectCountByUserId(Integer uid);
}