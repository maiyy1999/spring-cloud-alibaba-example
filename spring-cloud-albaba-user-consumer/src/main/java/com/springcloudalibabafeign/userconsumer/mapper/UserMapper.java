package com.springcloudalibabafeign.userconsumer.mapper;

import com.springcloudalibabafeign.userconsumer.domain.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}