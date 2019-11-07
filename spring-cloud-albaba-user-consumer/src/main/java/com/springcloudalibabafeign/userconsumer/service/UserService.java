package com.springcloudalibabafeign.userconsumer.service;

import com.springcloudalibabafeign.userconsumer.domain.entity.User;
import com.springcloudalibabafeign.userconsumer.domain.vo.UserVo;

/**
 * @author myy
 */
public interface UserService {


    User getData(Integer uid);


    UserVo getUserVo(int uid);


}
