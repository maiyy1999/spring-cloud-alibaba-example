package com.springcloudalibabafeign.userconsumer.service;

import com.springcloudalibabafeign.userconsumer.domain.dto.IntegralDto;
import com.springcloudalibabafeign.userconsumer.domain.entity.User;
import com.springcloudalibabafeign.userconsumer.domain.vo.UserVo;
import com.springcloudalibabafeign.userconsumer.mapper.LevelMapper;
import com.springcloudalibabafeign.userconsumer.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author myy
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Resource
    IntegralService integralService;

    @Resource
    LevelMapper levelMapper;



    @Override
    public User getData(Integer uid) {
        User user = userMapper.selectByPrimaryKey(uid);
        return user;
    }

    @Override
    public UserVo getUserVo(int uid) {
        IntegralDto memberData = integralService.getMemberData(uid);
        int i = levelMapper.selectByScope(memberData.getIntegralCount());

        UserVo userVo = new UserVo();
        userVo.setIntegralDto(memberData);
        userVo.setUser(getData(uid));
        userVo.setLevelGrade(i);
        return userVo;
    }
}
