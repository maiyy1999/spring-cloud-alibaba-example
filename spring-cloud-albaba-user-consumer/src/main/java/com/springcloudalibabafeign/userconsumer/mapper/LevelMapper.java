package com.springcloudalibabafeign.userconsumer.mapper;

import com.springcloudalibabafeign.userconsumer.domain.entity.Level;

public interface LevelMapper {
    int deleteByPrimaryKey(Integer levelId);

    int insert(Level record);

    int insertSelective(Level record);

    Level selectByPrimaryKey(Integer levelId);

    int updateByPrimaryKeySelective(Level record);

    int updateByPrimaryKey(Level record);

    int selectByScope(Integer scope);
}