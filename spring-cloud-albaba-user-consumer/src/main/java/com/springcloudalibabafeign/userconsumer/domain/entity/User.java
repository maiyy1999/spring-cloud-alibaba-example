package com.springcloudalibabafeign.userconsumer.domain.entity;

import lombok.Data;

@Data
public class User {
    /**
    * 用户ID 主键
    */
    private Integer uid;

    /**
    * 用户名
    */
    private String username;
}