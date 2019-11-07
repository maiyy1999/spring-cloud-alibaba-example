package com.springcloudalibabafeign.userconsumer.domain.dto;

import lombok.Data;

/**
 * @author myy
 */
@Data
public class IntegralDto {

    /**
     * 积分的id
     */
    private Integer integralId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 积分数量
     */
    private Integer integralCount;
}
