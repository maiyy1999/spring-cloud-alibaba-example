package com.springcloudalibabafeign.userconsumer.service;

import com.springcloudalibabafeign.userconsumer.domain.dto.IntegralDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author myy
 */
@FeignClient("member-provider")
public interface IntegralService {
    /**
     *
     * @param uid 用户id
     * @return 用户积分服务
     */
    @RequestMapping("/number/{uid}")
    IntegralDto getMemberData(@PathVariable int uid);
}
