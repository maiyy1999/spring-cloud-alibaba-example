package com.springcloudalibabafeign.userconsumer.domain.vo;


import com.springcloudalibabafeign.userconsumer.domain.dto.IntegralDto;
import com.springcloudalibabafeign.userconsumer.domain.entity.User;
import lombok.Data;

@Data
public class UserVo {
    private User user;

    private IntegralDto integralDto;

    private int levelGrade;




}
