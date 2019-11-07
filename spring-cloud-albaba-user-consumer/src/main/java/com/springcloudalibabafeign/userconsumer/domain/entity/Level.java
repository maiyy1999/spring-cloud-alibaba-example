package com.springcloudalibabafeign.userconsumer.domain.entity;

import lombok.Data;

/**
 * @author myy
 */
@Data
public class Level {
    /**
    * 会员等级id
    */
    private Integer levelId;

    /**
    * 1表示青铜，2表示白银，3表示黄金，4表示星钻，5表示王者
    */
    private Boolean grade;

    /**
    * 开始积分
    */
    private Integer startScope;

    /**
    * 结束积分
    */
    private Integer endScope;
}